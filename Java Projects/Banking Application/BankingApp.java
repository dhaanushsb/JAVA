import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankingApp {

    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String DB_USER = "Scott";
    private static final String DB_PASSWORD = "admin11";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Connected to the database!");

            while (true) {
                System.out.println("\nBanking Menu:");
                System.out.println("1. Check Bank Balance");
                System.out.println("2. Cash Deposit");
                System.out.println("3. Cash Withdraw");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Account Number: ");
                        int accountNumber1 = sc.nextInt();
                        checkBalance(connection, accountNumber1);
                        break;
                    case 2:
                        System.out.print("Enter Account Number: ");
                        int accountNumber2 = sc.nextInt();
                        System.out.print("Enter Amount to Deposit: ");
                        double depositAmount = sc.nextDouble();
                        deposit(connection, accountNumber2, depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter Account Number: ");
                        int accountNumber3 = sc.nextInt();
                        System.out.print("Enter Amount to Withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        withdraw(connection, accountNumber3, withdrawAmount);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    private static void checkBalance(Connection connection, int accountNumber) {
        String query = "SELECT balance FROM accounts WHERE account_number = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, accountNumber);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                double balance = rs.getDouble("balance");
                System.out.printf("Account Balance: %.2f%n", balance);
            } else {
                System.out.println("Account not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error checking balance: " + e.getMessage());
        }
    }

    private static void deposit(Connection connection, int accountNumber, double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }

        String query = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setDouble(1, amount);
            pstmt.setInt(2, accountNumber);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Deposit successful.");
            } else {
                System.out.println("Account not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error during deposit: " + e.getMessage());
        }
    }

    private static void withdraw(Connection connection, int accountNumber, double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
            return;
        }

        String queryCheck = "SELECT balance FROM accounts WHERE account_number = ?";
        String queryUpdate = "UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
        
        try {
            connection.setAutoCommit(false);  // Start transaction

            try (PreparedStatement pstmtCheck = connection.prepareStatement(queryCheck);
                 PreparedStatement pstmtUpdate = connection.prepareStatement(queryUpdate)) {

                pstmtCheck.setInt(1, accountNumber);
                ResultSet rs = pstmtCheck.executeQuery();

                if (rs.next()) {
                    double balance = rs.getDouble("balance");
                    if (balance >= amount) {
                        pstmtUpdate.setDouble(1, amount);
                        pstmtUpdate.setInt(2, accountNumber);
                        pstmtUpdate.executeUpdate();
                        connection.commit();  // Commit transaction
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient balance.");
                        connection.rollback();  // Rollback transaction
                    }
                } else {
                    System.out.println("Account not found.");
                    connection.rollback();  // Rollback transaction
                }
            } catch (SQLException e) {
                connection.rollback();  // Rollback transaction on error
                System.out.println("Error during withdrawal: " + e.getMessage());
            } finally {
                connection.setAutoCommit(true);  // Restore default
            }
        } catch (SQLException e) {
            System.out.println("Error with transaction: " + e.getMessage());
        }
    }
}

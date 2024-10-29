package NumberTask;

public class NumberClassification {
    public static void main(String[] args) {
        int number = 12;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum < number) {
            System.out.println("Deficient");
        } else if (sum == number) {
            System.out.println("Perfect");
        } else {
            System.out.println("Abundant");
        }
    }
}

public class EvenOrOdd {
    public static String isEvenOrOdd(int n) {
        return n % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("The number is: " + isEvenOrOdd(n));  // Output: Odd
    }
}

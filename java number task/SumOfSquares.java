public class SumOfSquares {
    public static int sumOfSquaresOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println("Sum of Squares: " + sumOfSquaresOfDigits(n));  // Output: 14
    }
}

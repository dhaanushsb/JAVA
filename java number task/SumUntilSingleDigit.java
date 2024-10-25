public class SumUntilSingleDigit {
    public static int sumUntilSingleDigit(int n) {
        while (n > 9) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }

    public static void main(String[] args) {
        int n = 9875;
        System.out.println("Single Digit Sum: " + sumUntilSingleDigit(n));  // Output: 2
    }
}

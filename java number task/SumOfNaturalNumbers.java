public class SumOfNaturalNumbers {
    public static int sumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum: " + sumOfNaturalNumbers(n));  // Output: 55
    }
}

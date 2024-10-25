public class Divisors {
    public static void findDivisors(int n) {
        System.out.print("Divisors: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int n = 24;
        findDivisors(n);  // Output: 1, 2, 3, 4, 6, 8, 12, 24
    }
}

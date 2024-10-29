package NumberTask;

public class SumOfPrimes {
    public static void main(String[] args) {
        int start = 10, end = 20, sum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println("Sum of primes: " + sum);
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

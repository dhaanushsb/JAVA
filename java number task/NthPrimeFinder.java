package NumberTask;

public class NthPrimeFinder {
    public static void main(String[] args) {
        int n = 6;
        int count = 0, num = 1;
        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }
        System.out.println(n + "th prime number: " + num);
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}


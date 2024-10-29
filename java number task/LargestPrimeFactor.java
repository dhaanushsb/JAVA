package NumberTask;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        int number = 28;
        int largestPrimeFactor = -1;

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                largestPrimeFactor = i;
                number /= i;
            }
        }
        System.out.println("Largest prime factor: " + largestPrimeFactor);
    }
}

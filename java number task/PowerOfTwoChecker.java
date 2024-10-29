package NumberTask;
public class PowerOfTwoChecker {
    public static void main(String[] args) {
        int number = 16;
        boolean isPowerOfTwo = (number & (number - 1)) == 0 && number > 0;
        System.out.println("Is power of two: " + isPowerOfTwo);
    }
}

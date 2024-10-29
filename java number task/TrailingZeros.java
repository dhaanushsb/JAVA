package NumberTask;

public class TrailingZeros {
    public static void main(String[] args) {
        int number = 10;
        int count = 0;
        for (int i = 5; number / i >= 1; i *= 5) {
            count += number / i;
        }
        System.out.println("Number of trailing zeros: " + count);
    }
}

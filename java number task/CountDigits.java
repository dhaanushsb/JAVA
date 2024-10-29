package NumberTask;

public class CountDigits {
    public static void main(String[] args) {
        int number = 12345;
        int count = Integer.toString(number).length();
        System.out.println("Number of digits: " + count);
    }
}

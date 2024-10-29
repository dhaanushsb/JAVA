package NumberTask;

public class DigitalRoot {
    public static void main(String[] args) {
        int number = 456;
        int result = 0;
        while (number > 0) {
            result += number % 10;
            number /= 10;
            if (number == 0 && result > 9) {
                number = result;
                result = 0;
            }
        }
        System.out.println("Digital root: " + result);
    }
}

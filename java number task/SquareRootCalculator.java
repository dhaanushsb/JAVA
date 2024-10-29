package NumberTask;

public class SquareRootCalculator {
    public static void main(String[] args) {
        double number = 25;
        double guess = number / 2;
        double epsilon = 0.0001;
        while (Math.abs(guess * guess - number) >= epsilon) {
            guess = (guess + number / guess) / 2;
        }
        System.out.println("Square root: " + guess);
    }
}


package NumberTask;

public class ProductOfDigits {
    public static void main(String[] args) {
        int number = 234;
        int product = 1;
        while (number != 0) {
            product *= number % 10;
            number /= 10;
        }
        System.out.println("Product of digits: " + product);
    }
}

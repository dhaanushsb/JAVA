public class CheckAlphabetic {
    public static String isAlphabetic(String str) {
        if (str.matches("[a-zA-Z]+")) {
            return "Contains only alphabetic characters";
        } else {
            return "Contains non-alphabetic characters";
        }
    }

    public static void main(String[] args) {
        String input = "Python3";
        System.out.println("Output: " + isAlphabetic(input));
    }
}

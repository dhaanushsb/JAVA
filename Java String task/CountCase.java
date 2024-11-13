public class CountCase {
    public static void countCase(String str) {
        int uppercase = 0, lowercase = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercase++;
            } else if (Character.isLowerCase(ch)) {
                lowercase++;
            }
        }

        System.out.println("Uppercase: " + uppercase + ", Lowercase: " + lowercase);
    }

    public static void main(String[] args) {
        String input = "Hello World";
        countCase(input);
    }
}

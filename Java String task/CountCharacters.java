public class CountCharacters {
    public static void countCharacters(String str) {
        int letters = 0, digits = 0, specialChars = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                specialChars++;
            }
        }

        System.out.println("Letters: " + letters + ", Digits: " + digits + ", Special characters: " + specialChars);
    }

    public static void main(String[] args) {
        String input = "Hello123!";
        countCharacters(input);
    }
}

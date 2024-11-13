public class SwapCase {
    public static String swapCase(String str) {
        StringBuilder swapped = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                swapped.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                swapped.append(Character.toUpperCase(ch));
            } else {
                swapped.append(ch);
            }
        }

        return swapped.toString();
    }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Swapped case: " + swapCase(input));
    }
}

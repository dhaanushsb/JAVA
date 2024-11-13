public class CapitalizeEachWord {
    public static String capitalizeWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder capitalizedSentence = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                capitalizedSentence.append(Character.toUpperCase(word.charAt(0)))
                                   .append(word.substring(1)).append(" ");
            }
        }
        return capitalizedSentence.toString().trim();
    }

    public static void main(String[] args) {
        String input = "hello world";
        System.out.println("Output: " + capitalizeWords(input));
    }
}

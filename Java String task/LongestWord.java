public class LongestWord {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        String input = "I love programming";
        System.out.println("Longest word: " + findLongestWord(input));
    }
}

import java.util.HashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        System.out.println("Output: " + removeDuplicates(input));
    }
}

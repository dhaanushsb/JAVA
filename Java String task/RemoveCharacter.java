public class RemoveCharacter {
    public static String removeCharacter(String str, char ch) {
        return str.replace(Character.toString(ch), "");
    }

    public static void main(String[] args) {
        String input = "balloon";
        char charToRemove = 'l';
        System.out.println("Output: " + removeCharacter(input, charToRemove));
    }
}

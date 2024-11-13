public class HyphenEvenDigits {
    public static String addHyphenBetweenEvens(String str) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(i));
            if (i < str.length() - 1 && Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(i + 1))) {
                int currentDigit = Character.getNumericValue(str.charAt(i));
                int nextDigit = Character.getNumericValue(str.charAt(i + 1));
                
                if (currentDigit % 2 == 0 && nextDigit % 2 == 0) {
                    result.append("-");
                }
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "2468";
        System.out.println("Output: " + addHyphenBetweenEvens(input));
    }
}

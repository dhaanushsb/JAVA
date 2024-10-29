package NumberTask;

public class SumOddEvenPositions {
    public static void main(String[] args) {
        String number = "13245";
        int oddSum = 0, evenSum = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            if ((i + 1) % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }
        System.out.println("Odd Position Sum: " + oddSum);
        System.out.println("Even Position Sum: " + evenSum);
    }
}

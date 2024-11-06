import java.util.Scanner;
public class SwapFirstLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = input.nextLine();
        char first = str.charAt(0);
        String middle = str.substring(1, str.length()-1);
        char last = str.charAt(str.length()-1);
        String swap = last+middle+first;
        System.out.println("Original String : "+ str);
        System.out.println("Swapped String : "+ swap);
    }
}

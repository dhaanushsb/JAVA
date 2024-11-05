import java.util.Scanner;

public class StrLength {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = input.nextLine();
        int length = 0;
        for(char ch: str.toCharArray()){
            length++;
        }
        System.out.println(length);
        input.close();
    }
}

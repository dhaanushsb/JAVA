import java.util.Scanner;
public class FrequencyStr{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Word:");
        String Str = input.nextLine();
        int count =0;
        System.out.println("Enter the target letter:");
        char target = input.nextLine().charAt(0);

        for(int i =0;i<Str.length();i++){
            if(target == Str.charAt(i)){
                count++;
            }
        }
        System.out.println("the character "+ target + " repeated in the word is "+ count);
    }
}
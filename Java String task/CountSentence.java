import java.util.Scanner;

public class CountSentence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String str = sc.nextLine();
        System.out.println(CountWords(str));
        sc.close();
    }
    public static int CountWords(String str){
        if(str == null || str.isEmpty()){
            return 0;
        }
        String[] words = str.split(" ");
        return words.length;
    }
    
}
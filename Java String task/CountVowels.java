import java.util.Scanner;

public class CountVowels{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        int CountVowels = 0;
        int CountConsonents = 0;
        input = input.toLowerCase();
        for(int i=0;i<input.length();i++)
        {
            char ch = input.charAt(i);
            if(ch>= 'a'&& ch<='z'){
            if(ch =='a'||ch=='e'||ch =='i'||ch=='o'||ch =='u'){
                CountVowels++;
            }
            else{
                CountConsonents++;
            }
        }
        }
        System.out.println("Number of Vowels: "+ CountVowels);
        System.out.println("Number of Vowels: "+ CountConsonents);

        sc.close();
    }
}
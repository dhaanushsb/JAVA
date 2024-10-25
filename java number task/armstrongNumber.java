import java.util.Scanner;

public class armstrongNumber {
    static boolean isarmstrong(int num){
        int number = num;
        int sum =0;
        while(num!=0){
            int digit = num%10;
            sum = sum + (digit*digit*digit);
            num =  num/10;
        }
        return sum == number;
    }

 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if (isarmstrong(number)) {
        System.out.println(number + " is an Armstrong number.");
    } else {
        System.out.println(number + " is not an Armstrong number.");
    }
    sc.close();
 }
}

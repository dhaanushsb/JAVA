import java.util.Scanner;

class numbersum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int sum = 0;
        while(number !=0){
            int digit = number %10;
            sum = sum + digit;
            number = number/10;
        }
        System.out.println("Sum is: "+sum);
        sc.close();
    }

}
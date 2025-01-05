import java.util.*;
public class HashTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        for (int i = 1; i <= num; i++) {
            
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }

            
            System.out.println();
        }
        for (int i = 1; i <= 2 * num - 1; i++) {
            System.out.print("#");
        }
        System.out.println();
        sc.close();
    }
}

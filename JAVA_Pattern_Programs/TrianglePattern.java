import java.util.*;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            
            for (int s = 0; s < (n - 1 - i); s++) {
                System.out.print("  ");
            }

            
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }

            
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(j + " "); 
            } 

            System.out.println();
        }
        sc.close();
    }
}
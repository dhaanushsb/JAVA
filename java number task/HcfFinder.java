package NumberTask;

public class HcfFinder {
    public static void main(String[] args) {
        int a = 24, b = 36, c = 48;
        int hcf = findHCF(findHCF(a, b), c);
        System.out.println("HCF: " + hcf);
    }

    static int findHCF(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}


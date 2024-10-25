public class LCM {
    public static int findLCM(int a, int b) {
        return (a * b) / GCD.findGCD(a, b);
    }

    public static void main(String[] args) {
        int a = 12, b = 18;
        System.out.println("LCM: " + findLCM(a, b));  // Output: 36
    }
}

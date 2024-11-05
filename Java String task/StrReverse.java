public class StrReverse {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();
        System.out.println(reverse);
    }
}

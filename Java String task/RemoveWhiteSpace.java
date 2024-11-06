public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str =" Hello My Name is Dhaanush";
        String newStr = str.replaceAll("\s", "");
        System.out.println(newStr);
    }
}

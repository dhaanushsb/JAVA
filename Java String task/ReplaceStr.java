public class ReplaceStr {
    public static void main(String[] args){
        String str = "Hello";
        System.out.println(replacechar(str,'e','a'));
    }
    public static String replacechar(String str, char oldchar,char newchar){
        return str.replace(oldchar, newchar);
    }
}

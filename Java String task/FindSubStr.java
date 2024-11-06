public class FindSubStr {
    public static void main(String[] args){
        String mainstr = "Hello World";
        String substr = "World";
        int position = mainstr.indexOf(substr);
        if(position != -1){
            System.out.println("Substring is placed at the index of: "+ position);
        }
        else{
            System.out.println("Sub String not Found.");
        }
    }
}

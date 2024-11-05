public class StrPalindrome 
{
    public static void main(String[] args)
    {
    String str = "MOM";
    String lower = str.toLowerCase();
    int left = 0;
    int right = lower.length() - 1;
    while(left < right)
    {
        if(lower.charAt(left) != lower.charAt(right))
        {
            System.out.println("Not Palindrome");
        }
            left++;
            right--;
    }
    }
}

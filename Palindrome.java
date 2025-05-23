public class Palindrome {
    public static void main(String []args ){
        int x = -121;
        boolean isPal = isPalindrome(x);
        System.out.println(isPal);
    }
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}

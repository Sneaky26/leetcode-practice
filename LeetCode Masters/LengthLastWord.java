public class LengthLastWord {
    public static void main(String[] args) {
        String s = "a";
        int result = lengthOfLastWord(s);
        System.out.println("length: " + result);
    }
    public static int lengthOfLastWord(String s) {
        String result = "";
        int length = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
            return length;
            }           
            result += s.charAt(i);
            length = result.length();
        }
        return length;
    }
}

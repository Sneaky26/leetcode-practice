public class Prefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"ab","a"};
        String result = longestCommonPrefix(strs);
        System.out.println("The prefix: " + result);
    }
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 1) {
            return strs[0];
        }
        for (int j = 0; j < strs.length - 1; j++) {
            
            for (int i = 0; i < 2; i++) {
                if (i >= strs[j].length() || i >= strs[j + 1].length()) { return result; }
                if (result.length() >= 2) {
                    return result;
                }
                if (strs[j].charAt(i) == strs[j + 1].charAt(i)) {
                    result += strs[j].charAt(i);
                } 
                else {
                    break;
                }
            }
        }
        return result;
    }
}

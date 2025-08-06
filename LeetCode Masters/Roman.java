
public class Roman {
    class Solution {
    public static void main (String[]args) {

        String roman = "IVIV";      
        int result = romanToInt(roman); 
        System.out.println("The integer value is: " + result);
    }
    public static int romanToInt(String s) {
        int sum = 0, ans = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) == 'I'){
                sum = 1;
            }else if (s.charAt(i) == 'V'){
                sum = 5;
            }else if (s.charAt(i) == 'X'){
                sum = 10;
            }else if (s.charAt(i) == 'L'){
                sum = 50;
            }else if (s.charAt(i) == 'C'){
                sum = 100;
            }else if (s.charAt(i) == 'D'){
                sum = 500;
            }else if (s.charAt(i) == 'M'){
                sum = 1000;
            }
            if (4 * sum < ans) {
                ans -= sum;
            } else {
                ans += sum;
            }
        }
        return ans;
        }
    }
}

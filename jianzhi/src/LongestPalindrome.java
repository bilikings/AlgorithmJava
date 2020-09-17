/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/8/1 11:49
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        int maxLen = 1;
        String res = s.substring(0, 1);
        for (int i = 0; i < s.length() - 1; i++) {
            String odd = midFind(s,i,i);
            String even = midFind(s,i,i+1);
            String maxString =odd.length()>even.length()? odd:even;
            if(maxString.length()>maxLen){
                res = maxString;
                maxLen = maxString.length();
            }
        }
        return res;
    }

    public  String midFind(String s, int left, int right) {
        int len = s.length();
        while (left >= 0 && right < len) {
            if (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            } else {
                break;
            }
        }
        return s.substring(left+1,right);
    }
}

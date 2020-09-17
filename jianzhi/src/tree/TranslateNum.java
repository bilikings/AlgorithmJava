package tree;

/**
 * @author atom.hu
 * @version V1.0
 * @Package tree
 * @date 2020/4/30 18:01
 */
public class TranslateNum {
    public int translateNum(int num) {
        if (num <= 9) {
            return 1;
        }
        String s = num + "";
        int[] dp = new int[s.length() + 2];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i < dp.length; i++) {
            char ch = s.charAt(i - 2);
            if ((i + 1 < dp.length) && (ch == '1' || (ch == '2' && s.charAt(i - 1) <= '5'))) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else dp[i] = dp[i - 1];
        }
        return dp[dp.length - 1];
    }
}

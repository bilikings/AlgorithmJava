/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/5/4 18:08
 */
public class CuttingRope {
    public int cuttingRope(int n) {
        if (n <= 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j, dp[j]) * (i - j));
            }
        }
        return dp[n];
    }

    public int cuttingRope2(int n) {
//        if (n <= 3) {
//            return n - 1;
//        }
//        int b = n % 3;
//        int p = 1000000007;
//        long rem = 1, x = 3;
//        for (int a = n / 3 - 1; a > 0; a /= 2) {//快速幂求余
//            if (a % 2 == 1) {
//                rem = (rem * x) % p;
//            }
//            x = (x * x) % p;
//
//        }
//        if (b == 0) {
//            return (int) (rem * 3 % p);
//        }
//        if (b == 1) {
//            return (int) (rem * 4 % p);
//        }
//        return (int) (rem * 6 % p);
        if (n <= 3) return n - 1;
        int b = n % 3, p = 1000000007;
        long rem = 1, x = 3;
        for (int a = n / 3 - 1; a > 0; a /= 2) {
            if (a % 2 == 1) {
                rem = (rem * x) % p;
            }
            x = (x * x) % p;
        }
        if (b == 0) return (int) (rem * 3 % p);
        if (b == 1) return (int) (rem * 4 % p);
        return (int) (rem * 6 % p);

    }
}
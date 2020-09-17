package weekendExam;

import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package weekendExam
 * @date 2020/9/12 14:48
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] a = new int[s.length()+1];
        int[] b = new int[s.length()+1];
        int[] c = new int[s.length()+1];
        int[] x = new int[s.length()+1];
        int[] y = new int[s.length()+1];
        int[] z = new int[s.length()+1];
        //int ac = 0, bc = 0, cc = 0, xc = 0, yc = 0, zc = 0;
        char first = s.charAt(0);
        for (int i = 1; i <= s.length(); i++) {
            char tmp = s.charAt(i-1);
            if (tmp == 'a') {
                a[i] = a[i - 1] + 1;
            } else {
                a[i] = a[i - 1];
            }
            if (tmp == 'b') {
                b[i] = b[i - 1] + 1;
            } else {
                b[i] = b[i - 1];
            }
            if (tmp == 'c') {
                c[i] = c[i - 1] + 1;
            } else {
                c[i] = c[i - 1];
            }
            if (tmp == 'x') {
                x[i] = x[i - 1] + 1;
            } else {
                x[i] = x[i - 1];
            }
            if (tmp == 'y') {
                y[i] = y[i - 1] + 1;
            } else {
                y[i] = y[i - 1];
            }
            if (tmp == 'z') {
                z[i] = z[i - 1] + 1;
            } else {
                z[i] = z[i - 1];
            }
        }
        int ans = 0;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <=i ; j++) {
                if(((a[i]-a[j-1])&1)==1){
                    continue;
                }
                if(((b[i]-b[j-1])&1)==1){
                    continue;
                }
                if(((c[i]-c[j-1])&1)==1){
                    continue;
                }
                if(((x[i]-x[j-1])&1)==1){
                    continue;
                }
                if(((y[i]-y[j-1])&1)==1){
                    continue;
                }
                if(((z[i]-z[j-1])&1)==1){
                    continue;
                }
                ans = Math.max(ans,i-j+1);
            }
        }
        System.out.println(ans);
    }
}

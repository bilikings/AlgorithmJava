package exam;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package exam
 * @date 2020/8/8 15:27
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        int[] c = new int[n+1];

        for (int i = 1; i <= m; i++) {
            int s= sc.nextInt();
            a[i] =s;
            b[s] = 1;
        }
        int p =0;
        for (int i = 1; i <=n ; i++) {
            if(b[i]==0){
                c[++p] = i;
            }
        }

        int pos =0,pp=1;
        for (int i = 1; i <=m ; i++) {
            while (pp<=p&&c[pp]<a[i]){
                b[++pos] =c[pp++];
            }
            b[++pos] = a[i];
        }
        while (pp<=p){
            b[++pos] =c[pp++];
        }
        StringBuilder res = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            res.append(b[i]).append(" ");
        }
        System.out.println(res.toString());
    }
}

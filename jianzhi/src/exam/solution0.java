package exam;

import java.util.Scanner;

public class solution0 {
    static int N = 100000+5;
    static int[] fa = new int[N];
    static int[] a = new int[N];
    static int n,m,k,x;
    public static int find(int x){
        if(fa[x]!=x){
            fa[x] = find(fa[x]);
        }
        return fa[x];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            fa[i] = i;
        }
        for (int i = 1; i <=m ; i++) {
            k = scanner.nextInt();
            for(int j =1;j<=k;j++){
                a[j] =scanner.nextInt();
            }
            for(int j =2;j<=k;j++){
                if(find(a[j])==find(a[1])) {
                    continue;
                }
                int x = find(a[1]);
                int y = find(a[j]);
                fa[y] = x;

            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if(find(i)==find(0)) {
                res++;
            }
        }
        System.out.println(res);
    }
}

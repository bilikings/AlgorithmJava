package graph;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package graph
 * @date 2020/9/16 19:35
 */
public class BinaryCompare {
    static int n1, n2, m;
    static int N = 510, M = 100010, index = 0;
    static int[] h = new int[N];
    static int[] e = new int[M];
    static int[] next = new int[M];
    static int[] match = new int[N];
    static boolean[] st = new boolean[N];

    public static boolean find(int x) {
        for (int i = h[x]; i != -1; i = next[i]) {
            int j = e[i];
            if (!st[j]) {//这个点没有被匹配过
                st[j] = true;
                if (match[j] == 0 || find(match[j])) {
                    match[j] = x;
                    return true;
                }
            }
        }
        return false;
    }

    public static void add(int a, int b) {
        e[index] = b;
        next[index] = h[a];
        h[a] = index++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        m = sc.nextInt();
        Arrays.fill(h, -1);
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            add(a, b);
        }
        int res = 0;
        for (int i = 1; i <= n1; i++) {
            Arrays.fill(st, false);
            if (find(i)) {
                res++;
            }
        }
        System.out.println(res);
    }
}

package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package graph
 * @date 2020/9/16 15:08
 */
public class Kruskal {
    public static int find(int[] f, int x) {
        return f[x] == x ? x : (f[x] = find(f, f[x]));
    }

    public static void init(int[] f) {
        for (int i = 0; i < f.length; i++) {
            f[i] = i;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] f = new int[n + 10];
        init(f);
        ArrayList<Edge> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            list.add(new Edge(a, b, c));
        }
        Collections.sort(list);
        int kruskal = kruskal(list,f, n, m);
        if(kruskal==-1){
            System.out.println("impossible");
        }else {
            System.out.println(kruskal);
        }
    }
    private static int kruskal(ArrayList<Edge> edges,int[] f,int n,int m ){
        int res = 0;
        int cnt = 0;
        for (Edge e:edges) {
            int x = e.a;
            int y = e.b;
            int len = e.w;
            int fa = find(f,x);
            int fb =find(f,y);
            if(fa==fb)continue;
            res +=len;
            f[fa] = fb;
            cnt++;
        }
        if(cnt<n-1){//说明这个图是不连通的
            return -1;
        }
        return res;
    }
}
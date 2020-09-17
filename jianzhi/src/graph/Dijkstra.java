package graph;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package graph
 * @date 2020/9/15 9:38
 */
public class Dijkstra {
    /**
     * m,边的数量
     * n，点的数量
     * dist[] 源点到i点的距离
     * vis[] t点是否已经在集合中
     * g[][] 使用临街矩阵来存储稠密图
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] g = new int[n + 10][n + 10];
        int[] dis = new int[n+10];
        boolean[] vis = new boolean[n+10];
        Arrays.fill(vis,false);
        Arrays.fill(dis, 10000);
        for (int[] gl : g
        ) {
            Arrays.fill(gl,10000);
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            g[a][b] = Math.min(g[a][b],c);
        }
        int t = dijkstra(g,dis,vis,n,m);
        System.out.println(t);
    }

    private static int dijkstra(int[][] g, int[] dist, boolean[] vis, int n, int m){
        dist[1] =0;//第一个是最小值
        for (int i = 0; i < n; i++) {
            int t = -1;
            for (int j = 1; j <=n ; j++) {
                if((!vis[j])&&(t==-1||dist[t]>dist[j])){
                    t =j;
                }
            }
            vis[t] = true;
            for (int j = 1; j <=n ; j++) {
                dist[j] =Math.min(dist[j],dist[t]+g[t][j]);
            }
        }
        if(dist[n]==10000) return -1;
        //System.out.println(Arrays.toString(dist));
        return dist[n];
    }

}

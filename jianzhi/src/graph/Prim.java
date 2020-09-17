package graph;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package graph
 * @date 2020/9/16 11:32
 */
public class Prim {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        int[][] graph = new int[n+10][n+10];
        int[] dis = new int[n+10];
        boolean[] vis = new boolean[n+10];
        Arrays.fill(vis,false);
        Arrays.fill(dis, 1000000);
        for(int[] l :graph){
            Arrays.fill(l,1000000);
        }
        for (int i = 0; i < m; i++) {
            int x =sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            graph[x][y] = graph[y][x]=Math.min(graph[x][y],z);
        }
        int t = prim(graph,n,dis,vis);
        if(t==1000000){
            System.out.println("impossible");
        }else {
            System.out.println(t);
        }
    }

    private static int prim(int[][] graph,int n ,int[] dist ,boolean[] vis) {
        //dist[1] =0;
        int res = 0;//存的是所有边的最小生成树之和
        for (int i = 0; i < n; i++) {
            int t =-1;
            for (int j = 1; j <=n ; j++) {
                if(!vis[j]&&(t==-1 || dist[t]>dist[j])){
                    t = j;//结束时候，t就存的是当前最小的点了
                }
            }
            if(i>0&&dist[t]==1000000){//如果不是第一个点，并且所有点的最短路程是max的话，说明没有联通的的点
                return 1000000;
            }
            if(i>0){
                res += dist[t];
            }
            for (int j = 1; j <=n; j++) {
                dist[j] = Math.min(dist[j],graph[t][j]);
            }
            vis[t] =true;
        }
        return res;
    }
}

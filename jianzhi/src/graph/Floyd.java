package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package graph
 * @date 2020/9/16 9:53
 */
public class Floyd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int m =scanner.nextInt();
        int req = scanner.nextInt();
        int[][] graph = new int[n+10][n+10];
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i==j){
                    graph[i][j]=0;
                }else {
                    graph[i][j] = 1000000;
                }
            }
        }
        for (int i = 1; i <=m; i++) {
            int x =scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            graph[x][y] = Math.min(graph[x][y],z);
        }
        //Floyd核心算法
        floyd(graph,n);
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < req; i++) {
            int x =scanner.nextInt();
            int y = scanner.nextInt();
            res.add(graph[x][y]);
        }
        for (int ans: res) {
            if(ans>=800000){
                System.out.println("impossible");
            }else {
                System.out.println(ans);
            }
        }
    }

    public static void  floyd(int[][] graph,int n){
        for (int k = 1; k <=n ; k++) {
            for (int i = 1; i <=n ; i++) {
                for (int j = 1; j <=n; j++) {
                    graph[i][j] = Math.min(graph[i][j],graph[i][k]+ graph[k][j]);
                }
            }
        }
    }

}

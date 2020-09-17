package graph;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package graph
 * @date 2020/9/16 16:13
 */
public class BinaryGraph {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n  = sc.nextInt();
        int m = sc.nextInt();
        int[][] graph = new int[n+10][n+10];
        int[] color = new int[n+10];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u][v] = graph[v][u] =1;
        }
        //染色法
        boolean flag = true;//判断染色的时候是不是有矛盾发生
        for (int i = 1; i <=n ; i++) {
            if(color[i]==0){
                if(!dfs(graph,color,n,m,i,1)){
                    flag =false;
                }
            }
        }
        if(!flag){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }

    private static boolean dfs(int[][] graph,int[] colors,int n ,int m, int index, int color ) {
        colors[index] =color;
        for (int i = 1; i <=n ; i++) {
            if(i==index){
                continue;
            }
            int j =graph[i][index];
            if(j==1){//说明有这条边
                if(colors[j]==0){
                    if(!dfs(graph,colors,n,m,j,3-color)) {
                        return false;
                    }
                }else if(colors[j]==color) {
                    return false;
                }
            }
        }
        return true;
    }
}

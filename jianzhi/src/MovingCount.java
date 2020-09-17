import java.util.LinkedList;
import java.util.Queue;

/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/5/16 19:34
 */
public class MovingCount {
//    public int movingCount(int m, int n, int k) {
//        boolean[][] visited = new boolean[m][n];
//        return dfs(0, 0, m, n, k, visited);
//    }
//
//    private int dfs(int i, int j, int m, int n, int k, boolean visited[][]) {
//        if (i < 0 || i >= m || j < 0 || j >= n || (i/10 + i%10 + j/10 + j%10) > k || visited[i][j]) {
//            return 0;
//        }
//        visited[i][j] = true;
//        return dfs(i + 1, j, m, n, k, visited) + dfs(i - 1, j, m, n, k, visited) +
//                dfs(i, j + 1, m, n, k, visited) + dfs(i, j - 1, m, n, k, visited) + 1;
//    }
    public int movingCount(int m, int n, int k) {
        int count =0;
        boolean[][] visit =new boolean[m][n];
        Queue<int[]> queue =new LinkedList<>();
        queue.add(new int[]{0,0,0,0});
        while (queue.size()>0){
            int[] x =queue.poll();
            int i = x[0],j=x[1],si=x[2],sj=x[3];
            if(i>=m||j>=n||k<si+sj||visit[i][j])continue;
            visit[i][j]=true;
            count++;
            queue.add(new int[]{i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8, sj });
            queue.add(new int[]{i , j+1, si,(j+1)%10!=0?sj+1:sj-8});
        }
        return count;
    }

}

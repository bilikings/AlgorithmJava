import java.util.Arrays;

/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/7/23 11:05
 */
public class minPath {
    public static int minPathSum(int[][] grid) {
        int h = grid.length;//行
        int w = grid[0].length;//列
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0 && j == 0) {
                    continue;
                } else if (i == 0) {
                    grid[i][j] = grid[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    grid[i][j] = grid[i - 1][j] + grid[i][j];
                } else {
                    grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
                }
            }
        }
        return grid[h - 1][w - 1];

    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 1}, {1, 5, 1}, {4, 2, 1}
        };
        System.out.println(minPathSum(arr));
    }
}

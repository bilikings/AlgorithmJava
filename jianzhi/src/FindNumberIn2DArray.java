/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/4/30 11:42
 */
public class FindNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int H = matrix.length;
        int L = matrix[0].length;
        int lp = 0;
        int hp = H - 1;
        while (hp >= 0 && lp < L) {
            if (matrix[hp][lp] == target) {
                return true;
            } else if (matrix[hp][lp] > target) {
                hp--;
            } else {
                lp++;
            }
        }
        return false;
    }
}

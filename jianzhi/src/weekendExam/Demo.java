package weekendExam;

/**
 * @author atom.hu
 * @version V1.0
 * @Package weekendExam
 * @date 2020/9/13 10:30
 */
public class Demo {
    public static void main(String[] args) {
        Demo demo =new Demo();
        int[][] mat= {{0,0},{0,0},{1,0}};
        System.out.println(demo.numSpecial(mat));
    }
    public int numSpecial(int[][] mat) {
        int h = mat.length;
        int w = mat[0].length;
        int count =0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if(mat[i][j]==1&& isS(mat,i,j)){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isS(int[][] mat,int x,int y){

        for (int i = 0; i < mat[0].length; i++) {
            if(i==y)continue;
            if(mat[x][i]!=0){
                return false;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            if(i==x)continue;
            if(mat[i][y]!=0){
                return false;
            }
        }
        return true;
    }
}

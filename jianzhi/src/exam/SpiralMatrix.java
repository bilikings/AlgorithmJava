package exam;

/**
 * @author atom.hu
 * @version V1.0
 * @Package exam
 * @date 2020/9/7 20:15
 */
public class SpiralMatrix {
    public int find(int n ,int i, int j ){
        if(i==1) return j;
        if(j==n) return n+i-1;
        if(i==n) return 3*n-2 -j+1;
        if(j==1) return 4*n - i -2;
        return find(n-2,i-1,j-1)+4*(n-1);
    }

    public static void main(String[] args) {
        SpiralMatrix a = new SpiralMatrix();
        System.out.println(a.find(5, 3, 2));
    }
}

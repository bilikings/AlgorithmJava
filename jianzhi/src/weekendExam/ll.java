package weekendExam;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author atom.hu
 * @version V1.0
 * @Package weekendExam
 * @date 2020/9/14 17:51
 */
public class ll {

    public int find(int x,int[] f){
        System.out.println(Arrays.toString(f));
        return f[x]==x?x:(f[x]=find(f[x],f));
    }

    public void union(int[] f,int a ,int b){
        int ra = find(a,f);
        int rb = find(b,f);
        if(ra==rb) return;
        f[ra] =rb;
    }

    public static void main(String[] args) {
        ll l = new ll();
        int[] f = new int[10];
        for (int i = 1; i <= 5; i++) {
            f[i]=i;
        }
        l.union(f,3,1);
        l.find(3,f);
        System.out.println(Arrays.toString(f));
    }
}

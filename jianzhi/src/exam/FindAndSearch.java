package exam;

/**
 * @author atom.hu
 * @version V1.0
 * @Package exam
 * @date 2020/9/6 18:51
 */
public class FindAndSearch {

    public void init(int[] p, int n){//n为集合的元素个数
        for (int i = 1; i <=n; i++) {
            p[i] = i;
        }
    }

    public int find(int[] p,int x){//返回x的祖宗节点+路径压缩
        if(p[x]!=x){
            p[x] =find(p, p[x]);
        }
        return p[x];
    }

    public boolean connected(int[] p,int a,int b){
        int ra = find(p,a);
        int rb = find(p,b);
        return ra==rb;
    }

    public void union(int[] p,int a,int b){
        int ra = find(p,a);
        int rb =find(p,b);
        if(ra==rb) return;
        p[ra] = rb;//b成为a的父节点
    }
}

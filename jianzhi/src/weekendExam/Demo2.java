package weekendExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @author atom.hu
 * @version V1.0
 * @Package weekendExam
 * @date 2020/9/13 10:42
 */
public class Demo2 {
    int[] f ;

    public int find(int x) {
        return f[x] == x ? x : find(f[x]);
    }

    public int minCostConnectPoints(int[][] points) {
        int h = points.length;
        f=new int[h*h/2];
        for (int i = 0; i < f.length; i++) {
            f[i]=i;
        }
        ArrayList<Edge> edges = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            for (int j = i + 1; j < h; j++) {
                int len = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                if (len != 0) {
                    edges.add(new Edge(i, j, len));
                }
            }
        }
        int ans =0;
        Collections.sort(edges);

        for(Edge e:edges){
            int x=e.getX();
            int yx =e.getY();
            int len = e.getLen();
            System.out.println(x+" "+yx+" "+len);
            if(find(x)==find(yx)) {
                continue;
            }
            ans+=len;
            f[find(x)] = find(yx);
        }
        System.out.println(Arrays.toString(f));
        return ans;
    }
}

class Edge implements Comparable<Edge> {
    private int x;
    private int y;
    private int len;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Edge(int x, int y, int len) {
        this.x = x;
        this.y = y;
        this.len = len;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    @Override
    public int compareTo(Edge o) {
        return Integer.compare(this.len, o.len);
    }
}

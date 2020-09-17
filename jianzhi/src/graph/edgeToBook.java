package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author atom.hu
 * @version V1.0
 * @Package graph
 * @date 2020/8/27 23:16
 */
public class edgeToBook {

    public static void main(String[] args) {
        List<List<Integer>> edgeSet = new ArrayList<>();
        List<Integer> r1 = new ArrayList<>(Arrays.asList(0,1,4));
        List<Integer> r2 = new ArrayList<>(Arrays.asList(1,4,6));
        List<Integer> r3 = new ArrayList<>(Arrays.asList(0,4,1));
        List<Integer> r4 = new ArrayList<>(Arrays.asList(4,3,4));
        List<Integer> r5 = new ArrayList<>(Arrays.asList(3,2,9));
        edgeSet.add(r1);
        edgeSet.add(r2);
        edgeSet.add(r3);
        edgeSet.add(r4);
        edgeSet.add(r5);
        int[][] ans = new int[5][5];
        int MAX = 999;

        for (int[] an : ans) {
            Arrays.fill(an,MAX);
        }

        for (List<Integer> edge: edgeSet) {
            int x=edge.get(0);
            int y = edge.get(1);
            int v = edge.get(2);
            ans[x][y]=v;
            ans[y][x]=v;
        }

        for (int[] an : ans) {
            System.out.println(Arrays.toString(an));
        }
    }
}

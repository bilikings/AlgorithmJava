package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package graph
 * @date 2020/9/15 12:29
 */
public class Bellman {
    /**
     * m 边数
     * n 点数
     * dist[] 边的最短长度
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Edge> edges = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] dist = new int[m + 10];
        Arrays.fill(dist, 10000);
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int w = sc.nextInt();
            edges.add(new Edge(a, b, w));
        }
        dist[1] = 0;
        int bellman = bellman(edges, dist, n, m,k);
        if (bellman == -1) {
            System.out.println("impossible");
        } else {
            System.out.println(bellman);
        }
    }

    private static int bellman(ArrayList<Edge> edges, int[] dist, int n, int m ,int k) {
        for (int i = 0; i < k; i++) {//只能k条边的时候，这里改为k
            int[] tempDist = Arrays.copyOfRange(dist, 0, dist.length - 1);
            for (int j = 0; j < m; j++) {
                Edge edge = edges.get(j);
                int a = edge.a;
                int b = edge.b;
                int w = edge.w;
                dist[b] = Math.min(dist[b], tempDist[a] + w);
            }
        }
        if(dist[n]>=10000/2){
            return -1;
        }
        return dist[n];
    }
}

class Edge implements Comparable<Edge> {
    int a;
    int b;
    int w;

    public Edge(int a, int b, int w) {
        this.a = a;
        this.b = b;
        this.w = w;
    }

    @Override
    public int compareTo(Edge o) {
        return Integer.compare(this.w - o.w, 0);
    }
}

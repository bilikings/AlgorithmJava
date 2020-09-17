package graph;

import sun.security.provider.certpath.Vertex;

import java.util.ArrayList;
import java.util.List;

/**
 * @author atom.hu
 * @version V1.0
 * @Package graph
 * @date 2020/8/27 14:49
 */
public class test {
    public static void main(String[] args) {
        List<Vertiex> vertexs = new ArrayList<>();
        Vertiex a = new Vertiex("A", 0);
        Vertiex b = new Vertiex("B");
        Vertiex c = new Vertiex("C");
        Vertiex d = new Vertiex("D");
        Vertiex e = new Vertiex("E");
        Vertiex f = new Vertiex("F");
        vertexs.add(a);
        vertexs.add(b);
        vertexs.add(c);
        vertexs.add(d);
        vertexs.add(e);
        vertexs.add(f);
        int[][] edges = {
                {Integer.MAX_VALUE,6,3,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                {6,Integer.MAX_VALUE,2,5,Integer.MAX_VALUE,Integer.MAX_VALUE},
                {3,2,Integer.MAX_VALUE,3,4,Integer.MAX_VALUE},
                {Integer.MAX_VALUE,5,3,Integer.MAX_VALUE,5,3},
                {Integer.MAX_VALUE,Integer.MAX_VALUE,4,5,Integer.MAX_VALUE,5},
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,3,5,Integer.MAX_VALUE}

        };
        Graph graph = new Graph(vertexs, edges);
        graph.printGraph();
        graph.search();
        graph.printSSSP();
    }
}

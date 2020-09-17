package graph;

import sun.security.provider.certpath.Vertex;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author atom.hu
 * @version V1.0
 * @Package graph
 * @date 2020/8/27 14:23
 */
public class Graph {
    private List<Vertiex> vertiexes;

    //边
    private int[][] edges;

    //没有被访问的节点
    private PriorityQueue<Vertiex> unVisited;

    public Graph(List<Vertiex> vertexes, int[][] edges) {
        this.vertiexes = vertexes;
        this.edges = edges;
        initVisited();
    }

    private void initVisited() {
        unVisited = new PriorityQueue<>();
        for (Vertiex v : vertiexes) {
            unVisited.add(v);
        }
    }

    public void search() {
        while (!unVisited.isEmpty()) {
            Vertiex v = unVisited.element();//返回头元素，和peek一样
            v.setMark(true);//设置成已经访问
            List<Vertiex> neighbors = getNeibors(v);
            updatesDistance(v,neighbors);
            unVisited.poll();
        }
    }
    
    /*
     * 更新所有邻居的最短路径
     */
    private void updatesDistance(Vertiex v, List<Vertiex> neighbors) {
        for(Vertiex nei:neighbors){
            updateDistance(v,nei);
        }
    }
    /*
     * 更新邻居的最短路径
     */
    private void updateDistance(Vertiex v, Vertiex nei) {
        int distance = getDistance(v,nei)+v.getPath();
        if(distance<nei.getPath()){
            unVisited.remove(nei);
            nei.setPath(distance);
            unVisited.add(nei);
        }
    }
    /*
     * 获取顶点到目标顶点的距离
     */
    private int getDistance(Vertiex v, Vertiex nei) {
        int sourceIndex = vertiexes.indexOf(v);
        int destIndex = vertiexes.indexOf(nei);
        return edges[sourceIndex][destIndex];
    }

    private List<Vertiex> getNeibors(Vertiex v) {
        List<Vertiex> neies = new ArrayList<>();
        int position = vertiexes.indexOf(v);
        Vertiex nei = null;
        int distance;
        for (int i = 0; i < vertiexes.size(); i++) {
            if (i == position) continue;
            distance = edges[position][i];
            if (distance < Integer.MAX_VALUE) {
                nei = vertiexes.get(i);
                if (!nei.isMark()) {
                    neies.add(nei);
                }
            }
        }
        return neies;
    }

    public void printGraph(){
        int verNum = vertiexes.size();
        for (int i = 0; i < verNum; i++) {
            for (int j = 0; j < verNum; j++) {
                if(Integer.MAX_VALUE ==edges[i][j]){
                    System.out.print("X ");
                    continue;
                }
                System.out.print(edges[i][j]+" ");

            }
            System.out.println();
        }
    }
    public void printSSSP() {
        for(Vertiex v : vertiexes) {
            System.out.println(v.getName() + " " + v.getPath());
        }
    }
}

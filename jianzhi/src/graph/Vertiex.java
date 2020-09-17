package graph;

/**
 * @author atom.hu
 * @version V1.0
 * @Package graph
 * @date 2020/8/27 14:20
 */
public class Vertiex implements Comparable<Vertiex> {
    private String name;
    private int path;
    private boolean isMark;

    public Vertiex(String name) {
        this.name = name;
    }

    public Vertiex(String name, int path) {
        this.name = name;
        this.path = path;
        this.isMark = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }

    public boolean isMark() {
        return isMark;
    }

    public void setMark(boolean mark) {
        isMark = mark;
    }

    @Override
    public int compareTo(Vertiex o) {
        return o.path > path ? 1 : -1;
    }
}

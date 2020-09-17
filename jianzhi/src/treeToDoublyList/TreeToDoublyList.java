package treeToDoublyList;

/**
 * @author atom.hu
 * @version V1.0
 * @Package treeToDoublyList
 * @date 2020/4/30 20:41
 */
public class TreeToDoublyList {
    public Node treeToDoublyList(Node root) {
        Node head =null;
        return head;
    }
}
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
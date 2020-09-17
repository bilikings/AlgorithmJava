package tree;

/**
 * @author atom.hu
 * @version V1.0
 * @Package tree
 * @date 2020/4/30 15:08
 */
public class MaxDepth {
    public static int maxDepth(TreeNode root) {
        if(root ==null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

    public static void preOrder(TreeNode biTree, int count) {
        if (biTree != null) {
            count++;
        }
        //递归左子树
        TreeNode left = biTree.left;
        if (left != null) {
            count++;
            preOrder(left, count);
        }
        //递归向右子树
        TreeNode right = biTree.right;
        if (right != null) {
            count++;
            preOrder(right, count);
        }
    }

    public static void main(String[] args) {
        TreeNode[] node = new TreeNode[10];//以数组形式生成一棵完全二叉树
        int count  =0;
        for (int i = 0; i < 10; i++) {
            node[i] = new TreeNode(i);
        }
        for (int i = 0; i < 10; i++) {
            if (i * 2 + 1 < 10) {
                node[i].left = node[i * 2 + 1];
            }
            if (i * 2 + 2 < 10) {
                node[i].right = node[i * 2 + 2];
            }
        }
        System.out.println(maxDepth(node[0]));

    }
}
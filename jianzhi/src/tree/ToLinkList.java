package tree;

import java.util.LinkedList;

/**
 * @author atom.hu
 * @version V1.0
 * @Package tree
 * @date 2020/8/2 10:49
 */
public class ToLinkList {
    LinkedList<TreeNode> res = new LinkedList<>();
    public void flatten(TreeNode root) {
        preOrder(root);
        if (res.size() > 1) {
            while (!res.isEmpty()) {
                root.left = null;
                root.right = res.pollFirst();
                root = root.right;
            }
        }
    }

    public void preOrder(TreeNode root) {
        if (root != null) {
            res.add(root);
            if (root.left != null) {
                preOrder(root.left);
            }
            if (root.right != null) {
                preOrder(root.right);
            }
        }
    }
}

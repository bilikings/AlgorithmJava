package tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author atom.hu
 * @version V1.0
 * @Package tree
 * @date 2020/7/28 16:00
 */
public class BFSForTreeDeep {
    public int maxDepth(TreeNode root) {
        if(root ==null){
            return 0;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.addFirst(root);
        int count = 0;
        while (!deque.isEmpty()){
            int size = deque.size();
            while (size-- >0){
                TreeNode tmp= deque.pop();
                if(tmp.left!=null){
                    deque.addLast(tmp.left);
                }
                if(tmp.right!=null){
                    deque.addLast(tmp.right);
                }
            }
            count++;
        }
        return count;
    }
}

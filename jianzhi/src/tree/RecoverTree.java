package tree;

import java.util.*;

/**
 * @author atom.hu
 * @version V1.0
 * @Package tree
 * @date 2020/8/8 10:33
 */
public class RecoverTree {
    LinkedList<Integer> res =new LinkedList<>();
    public void recoverTree(TreeNode root) {
        if(root==null){
            return;
        }
        dfs(root);
        Collections.sort(res);
        TreeNode newRoot = add(res,0,res.size()-1);
    }
    public void dfs(TreeNode root){
        if(root!=null){
            res.add(root.val);
        }
        dfs(root.left);
        dfs(root.right);
    }

    public TreeNode add(LinkedList<Integer> res,int start,int end){
        if(start>end) return null;
        int mid = (start+end)/2;
        TreeNode left =add(res, start, mid-1);
        TreeNode right = add(res, mid+1, end);
        TreeNode sout = new TreeNode(res.get(mid));
        sout.left=left;
        sout.right=right;
        return sout;
    }

}

package tree;

import java.util.Arrays;

/**
 * @author atom.hu
 * @version V1.0
 * @Package tree
 * @date 2020/4/30 14:57
 */
public class RebuildTree {
    //经典的建树
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        if(n==0){
            return null;
        }
        int rootVal =preorder[0];
        int rootIndex =0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==rootVal){
                rootIndex=i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootVal);
        root.left=buildTree(Arrays.copyOfRange(preorder,1,1+rootIndex),Arrays.copyOfRange(inorder,0,rootIndex));
        root.right=buildTree(Arrays.copyOfRange(preorder,1+rootIndex,n),Arrays.copyOfRange(inorder,rootIndex+1,n));
        return root;
    }


}

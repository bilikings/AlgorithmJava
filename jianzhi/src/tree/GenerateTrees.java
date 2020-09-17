package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author atom.hu
 * @version V1.0
 * @Package tree
 * @date 2020/7/21 21:48
 */
public class GenerateTrees {
    public List<TreeNode> generateTrees(int n) {
        if(n<1){
            return new ArrayList<>();
        }
        return creatTree(1,n);
    }

    public List<TreeNode> creatTree(int start,int end){
        List<TreeNode> res = new ArrayList<>();
        if(start>end){
            res.add(null);
            return res;
        }

        for(int i =start;i<=end;i++){
            List<TreeNode> left = creatTree(start,i-1);
            List<TreeNode> right= creatTree(i+1,end);
            //固定左孩子，遍历右孩子
            for (TreeNode l: left) {
                for (TreeNode r:right) {
                    TreeNode node = new TreeNode(i);
                    node.left = l;
                    node.right=r;
                    res.add(node);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        GenerateTrees gt = new GenerateTrees();
        List<TreeNode> treeNodes = gt.generateTrees(5);
        System.out.println(treeNodes.get(1).val);
        System.out.println("test");
    }
}

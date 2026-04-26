package Trees;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode17{
    int data;
    TreeNode17 left;
    TreeNode17 right;

    public TreeNode17(int key){
      data=key;
      left=right=null;
    }
}
public class countNumberOfNodesInCompleteBinaryTree {

    public static void main(String[] args) {
        TreeNode17 root = new TreeNode17(1);
        root.left = new TreeNode17(2);
        root.right = new TreeNode17(3);
        root.left.left = new TreeNode17(4);
        root.left.right = new TreeNode17(5);
        root.right.left = new TreeNode17(6);


        int totalNodes = countNodes(root);


        System.out.println(totalNodes);
    }
    public static int countNodes(TreeNode17 root){
        int count = 0;
        if (root == null){
            return 0;
        }

        int level=0;
        Queue<TreeNode17> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();

            for(int i=0;i<size;i++){
                TreeNode17 node = q.poll();
                count++;

                if (node.left!=null){
                    q.add(node.left);
                }
                if (node.right!=null){
                    q.add(node.right);
                }

            }
        }
        return count;
    }
}

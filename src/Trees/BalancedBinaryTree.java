package Trees;


import java.util.LinkedList;
import java.util.Queue;

class TreeNode6{
    int data;
    TreeNode6 left;
    TreeNode6 right;

    public TreeNode6(int key){
        data=key;
        left=null;
        right=null;
    }
}

public class BalancedBinaryTree {


    public static void main(String[] args) {
        TreeNode6 root = new TreeNode6(1);
        root.left = new TreeNode6(2);
        root.right = new TreeNode6(3);
        root.left.left = new TreeNode6(4);
        root.left.right = new TreeNode6(5);
        root.left.right.right = new TreeNode6(6);
        root.left.right.right.right = new TreeNode6(7);


         boolean balanced=balancedBinaryTree(root);
         String outcome=(balanced)? "The tree is balanced" :"The tree is not balanced";
         System.out.println(outcome);
    }
    public static boolean balancedBinaryTree(TreeNode6 root){
        if (root == null){
            return false;
        }

        Queue<TreeNode6> q=new LinkedList<>();
        q.add(root);

        int balancedDiff=0;
        while(!q.isEmpty()){
            int size=q.size();


            for (int i=0;i<size;i++) {
                int diff = 0;
                TreeNode6 node = q.poll();

                int left = 0;
                if (node.left != null) {
                    left = heightOfBinaryTree(node.left);
                }

                int right = 0;
                if (node.right != null) {
                    right = heightOfBinaryTree(node.right);
                }

                diff = Math.abs(left - right);
                balancedDiff = Math.max(balancedDiff,diff);
            }


        }
        if (balancedDiff <= 1) return true;
        else return false;
    }

    public static int heightOfBinaryTree(TreeNode6 root){
        if (root == null){
            return 0;
        }

        Queue<TreeNode6> q=new LinkedList<>();
        q.add(root);

        int level=0;
        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                TreeNode6 node = q.poll();

                if (node.left!=null){
                    q.add(node.left);
                }

                if (node.right!=null){
                    q.add(node.right);
                }

            }
            level++;

        }

        return level;
    }

}

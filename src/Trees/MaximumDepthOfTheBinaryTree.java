package Trees;

class TreeNode3{
    int data;
    TreeNode3 left;
    TreeNode3 right;

    TreeNode3(int key){
        data = key;
    }
}

public class MaximumDepthOfTheBinaryTree {


    public static int maxDepthOfTree(TreeNode3 root){
         if (root == null){
             return 0;
         }


         int leftDepth = maxDepthOfTree(root.left);
         int rightDepth = maxDepthOfTree(root.right);
         int maxDepth = 1 + Math.max(leftDepth,rightDepth);

         return maxDepth;
    }
}

package Trees;


import java.util.*;


class TreeNode13{
    int data;
    TreeNode13 left;
    TreeNode13 right;

    TreeNode13(int key){
        data = key;
    }
}

public class DiameterOfBinaryTree {

    public int diameterOfBinaryTree(TreeNode13 root){
        if (root == null){
            return 0;
        }

        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);

        return 1 + Math.max(left,right);
    }
}

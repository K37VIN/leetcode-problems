package Trees;

import java.util.*;

class TreeNode14{
    int data;
    TreeNode14 left;
    TreeNode14 right;


    TreeNode14(int key){
        data = key;
    }
}

public class BalancedBinaryTree {
    public int balancedTree(TreeNode14 root){
        if (root == null){
            return 0;
        }

        int left = balancedTree(root.left);
        int right = balancedTree(root.right);

        if (Math.abs(left - right) > 1) return -1;

        return 1 + Math.max(left, right);

    }

}

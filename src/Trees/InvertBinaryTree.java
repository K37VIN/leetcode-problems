package Trees;

import java.util.*;


class TreeNode6{
    int data;
    TreeNode6 left;
    TreeNode6 right;


    TreeNode6(int key){
        data = key;
    }
}

public class InvertBinaryTree {

    public static TreeNode6 invertTree(TreeNode6 root){
        if (root == null){
            return null;
        }

        TreeNode6 swap = root.left;
        root.left = root.right;
        root.right = swap;

        invertTree(root.left);
        invertTree(root.right);

        return root;

    }

}

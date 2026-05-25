package Trees;

import java.util.*;


class TreeNode15{
    int data;
    TreeNode15 left;
    TreeNode15 right;

    TreeNode15(int key){
        data = key;
    }
}

public class LongestUnivaluePath {
    public int longestUnivaluePath(TreeNode15 root){

        if (root == null){
            return 0;
        }


        int leftPath = 0;
        int rightPath = 0;

        int ans = 0;

        if (root.left != null && root.left.data == root.data){
            leftPath = 1 + longestUnivaluePath(root.left);
        }

        if (root.right != null && root.right.data == root.data){
            rightPath = 1 + longestUnivaluePath(root.right);
        }

        ans = Math.max(ans,leftPath+rightPath);

        return Math.max(leftPath,rightPath) ;
    }
}

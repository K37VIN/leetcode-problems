package Trees;

import java.util.*;
class TreeNode10{
    int data;
    TreeNode10 left;
    TreeNode10 right;

    TreeNode10(int key){
        data = key;
    }
}

public class MinimumDepthOfTree {


    public int minDepthOfTree(TreeNode10 root){

        if (root ==  null){
            return 0;
        }

        Queue<TreeNode10> q = new LinkedList<>();
        q.offer(root);
        int depth = 0;

        while(!q.isEmpty()){
            int size = q.size();
            for (int i = 0;i < size; i++){
                TreeNode10 node = q.poll();
                if (node.left == null && node.right == null){
                    return depth;
                }

                if (node.left != null){
                    q.offer(node.left);
                }

                if (node.right != null){
                    q.offer(node.right);
                }
            }

            depth++;
        }

        return depth;
    }
}

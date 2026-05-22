package Trees;

import java.util.*;

class TreeNode12{
    int data;
    TreeNode12 left;
    TreeNode12 right;

    TreeNode12(int key){
       data = key;
    }
}

public class MaximumLevelSumInBinaryTree {

    public int maxSumLevel(TreeNode12 root){
       if (root == null){
           return 0;
       }

       Queue<TreeNode12> q = new LinkedList<>();
       q.offer(root);
       int level = 1;
       int ansLevel = 1;
       int maxSum = Integer.MIN_VALUE;

       while(!q.isEmpty()){
           int size = q.size();
           int sum = 0;
           for (int i = 0; i < size;i++){
               TreeNode12 node = q.poll();
               sum+=node.data;

               if (node.left != null){
                   q.offer(node.left);
               }

               if (node.right != null){
                   q.offer(node.right);
               }
           }
           if (sum > maxSum){
               maxSum = sum;
               ansLevel = level;
           }

           level++;
       }
    return ansLevel;

    }
}

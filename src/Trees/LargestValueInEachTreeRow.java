package Trees;

import java.util.*;

class TreeNode11{
    int data;
    TreeNode11 left;
    TreeNode11 right;
}

public class LargestValueInEachTreeRow {

    public ArrayList<Integer> maxValueInEachRow(TreeNode11 root){
         if (root == null){
             return null;
         }

         ArrayList<Integer> list = new ArrayList<>();
         Queue<TreeNode11> q = new LinkedList<>();
         q.offer(root);

         while(!q.isEmpty()){
             int size = q.size();
             int maxi = 0;
             for (int i = 0;i < size;i++){
                 TreeNode11 node = q.poll();
                 maxi = Math.max(node.data,maxi);

                 if(node.left != null){
                     q.offer(node.left);
                 }
                 if(node.right != null){
                     q.offer(node.right);
                 }
             }
             list.add(maxi);
         }


         return list;
    }
}

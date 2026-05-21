package Trees;


import java.util.*;

class TreeNode7{
   int data;
   TreeNode7 left;
   TreeNode7 right;


   TreeNode7(int key){
       data = key;
   }
}

public class LevelOrderTraversal {

    public ArrayList<Integer> levelOrderTraversal(TreeNode7 root,ArrayList<Integer> list){
      if (root == null){
          return list;
      }

      Queue<TreeNode7> q = new LinkedList<>();
      q.offer(root);
      while(!q.isEmpty()){
          TreeNode7 node = q.poll();

          list.add(node.data);

          if (node.left != null){
              q.offer(node.left);
          }

          if (node.right != null){
              q.offer(node.right);
          }

      }

      return list;
    }
}

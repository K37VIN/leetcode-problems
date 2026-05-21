package Trees;


import java.util.*;



class TreeNode8{
    int data;
    TreeNode8 left;
    TreeNode8 right;


    TreeNode8(int key){
        data = key;
    }
}

public class ZigZagTraversal {

    public ArrayList<Integer> zigzagTraversal(TreeNode8 root,ArrayList<Integer> list){
             if (root == null){
                 return null;
             }


             Queue<TreeNode8> q = new LinkedList<>();
             q.offer(root);
             int level = 0;

             while(!q.isEmpty()){
                TreeNode8 node = q.poll();
                list.add(node.data);

                if (level % 2 == 0){
                    if (node.left != null){
                        q.offer(node.left);
                    }

                    if (node.right != null){
                        q.offer(node.right);
                    }
                }

                if (level % 2 != 0){
                    if (node.right != null){
                        q.offer(node.right);
                    }

                    if (node.left != null){
                        q.offer(node.left);
                    }

                }

                level++;
             }

             return list;
    }
}

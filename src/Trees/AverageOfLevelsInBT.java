package Trees;

import java.util.*;

class TreeNode9{
    int data;
    TreeNode9 left;
    TreeNode9 right;


    TreeNode9(int key){
        data = key;
    }
}

public class AverageOfLevelsInBT {
    public ArrayList<Double> AverageOfLevelsBT(TreeNode9 root,ArrayList<Double> list){
        Queue<TreeNode9> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            int sum = 0;
            for(int i=0;i<size;i++){
                 TreeNode9 node = q.poll();
                 sum+=node.data;

                 if (node.left!=null){
                     q.offer(node.left);
                 }
                 if (node.right != null){
                     q.offer(node.right);
                 }
            }
            list.add((double) (sum / size));
        }


        return list;
    }
}

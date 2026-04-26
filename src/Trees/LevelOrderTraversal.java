package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode3{
    int data;
    TreeNode3 left;
    TreeNode3 right;

    public TreeNode3(int key){
        data=key;
        left=null;
        right=null;
    }


}

public class LevelOrderTraversal {

    public static void main(String[] args) {
        TreeNode3 root = new TreeNode3(1);
        root.left = new TreeNode3(2);
        root.right = new TreeNode3(3);
        root.left.left = new TreeNode3(4);
        root.left.right = new TreeNode3(5);

        ArrayList<ArrayList<Integer>> result = levelOrderTraversal(root);
        System.out.println(result);
    }
    public static ArrayList<ArrayList<Integer>> levelOrderTraversal(TreeNode3 root){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (root == null){
            return ans;
        }

        Queue<TreeNode3> q= new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> level = new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode3 node = q.poll();
                assert node != null;
                level.add(node.data);

                if (node.left!= null){
                    q.add(node.left);
                }

                if (node.right!=null){
                    q.add(node.right);
                }


            }

            ans.add(level);
        }
        return ans;
    }
}

package Trees;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode10{
    int data;
    TreeNode10 left;
    TreeNode10 right;

    public TreeNode10(int key){
       data=key;
       left=null;
       right=null;
    }
}

public class ZigZagTraversal {

    public static void main(String[] args) {

        TreeNode10 root1 = new TreeNode10(1);
        root1.left = new TreeNode10(2);
        root1.right = new TreeNode10(3);
        root1.left.left = new TreeNode10(4);
        root1.left.right = new TreeNode10(5);
        root1.left.right.right = new TreeNode10(6);
        root1.left.right.right.right = new TreeNode10(7);

        ArrayList<ArrayList<TreeNode10>> result = zigZagTraversal(root1);


        for (int i = 0; i < result.size(); i++) {
            System.out.print("Level " + i + ": ");
            for (TreeNode10 node : result.get(i)) {
                System.out.print(node.data + " ");
            }
            System.out.println();
        }
    }


    public static ArrayList<ArrayList<TreeNode10>> zigZagTraversal(TreeNode10 root){
        ArrayList<ArrayList<TreeNode10>> ans=new ArrayList<>();
        if (root == null){
            return ans;
        }

        Queue<TreeNode10> q=new LinkedList<>();
        q.add(root);
        int levelOfTree=0;

        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<TreeNode10> level=new ArrayList<>();

            for(int i=0;i<size;i++) {

                    TreeNode10 node = q.poll();
                    level.add(node);

                    if (levelOfTree % 2 == 0) {
                    if (node.left!=null){
                        q.add(node.left);
                    }

                    if (node.right!=null){
                        q.add(node.right);
                    }
                    }

                    if (levelOfTree % 2 != 0) {
                    if (node.right!=null){
                        q.add(node.right);
                    }

                    if (node.left!=null){
                        q.add(node.left);
                    }
                }

            }
            ans.add(level);
            levelOfTree++;
        }
        return ans;
    }

}

package Trees;


import java.util.LinkedList;
import java.util.Queue;

class TreeNode5{
    int data;
    TreeNode5 left;
    TreeNode5 right;

    public TreeNode5(int key){
        data=key;
        left=null;
        right=null;
    }
}

public class HeightOfBinaryTree {


    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode5 root = new TreeNode5(1);
        root.left = new TreeNode5(2);
        root.right = new TreeNode5(3);
        root.left.left = new TreeNode5(4);
        root.left.right = new TreeNode5(5);
        root.left.right.right = new TreeNode5(6);
        root.left.right.right.right = new TreeNode5(7);


        int height=heightOfTree(root);
        System.out.println(height);

    }
    public static int heightOfTree(TreeNode5 root){
        int level=0;
        if (root == null){
            return 0;
        }

        Queue<TreeNode5> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();

            for(int i=0;i<size;i++){
                TreeNode5 node=q.poll();

                if (node.left!=null) {
                    q.add(node.left);
                }

                if (node.right!=null){
                    q.add(node.right);

                }


            }
            level++;



        }

        return level;

    }
}

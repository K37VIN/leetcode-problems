package Trees;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode7{
    int data;
    TreeNode7 left;
    TreeNode7 right;

    public TreeNode7(int key){
        data=key;
        left=null;
        right=null;
    }
}

public class DiameterOfBinaryTree {


    public static void main(String[] args) {
        TreeNode7 root = new TreeNode7(1);
        root.left = new TreeNode7(2);
        root.right = new TreeNode7(3);
        root.left.left = new TreeNode7(4);
        root.left.right = new TreeNode7(5);
        root.left.right.right = new TreeNode7(6);
        root.left.right.right.right = new TreeNode7(7);


        int diameter=diameterOfBinaryTree(root);

        System.out.println(diameter);

    }

    public static int diameterOfBinaryTree(TreeNode7 root){
        if (root == null){
            return 0;
        }

        int dist=0;
        Queue<TreeNode7> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();

            for(int i=0;i<size;i++){
                TreeNode7 node=q.poll();

                int left=0;
                if(node.left!=null){
                    left=heightOfBinaryTree(node.left);
                }

                int right=0;
                if(node.right!=null){
                    right=heightOfBinaryTree(node.right);
                }

                dist=Math.max(dist,Math.abs(left+right));

            }
        }

        return dist;

    }


    public static int heightOfBinaryTree(TreeNode7 root){
        if (root == null){
            return 0;
        }

        Queue<TreeNode7> q=new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();

            for(int i=0;i<size;i++){
                TreeNode7 node= q.poll();

                if (node.left!=null){
                    q.add(node.left);
                }

                if(node.right!=null){
                    q.add(node.right);
                }

            }
            level++;

        }

        return level;
    }

}

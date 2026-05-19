package Trees;

import java.util.ArrayList;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int key){
        data=key;
        left=null;
        right=null;
    }
}


public class InorderTraversal {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(5);

        ArrayList<Integer> list = inorder(root);

        System.out.println(list);
    }

    public static void inorderTraversal(TreeNode root, ArrayList<Integer> list){
        if (root == null){
            return;
        }

        inorderTraversal(root.left,list);
        list.add(root.data);
        inorderTraversal(root.right,list);
    }

    public static ArrayList<Integer>  inorder(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        inorderTraversal(root,list);
        return list;
    }
}

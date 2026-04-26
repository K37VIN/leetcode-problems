package Trees;

import java.util.ArrayList;

class TreeNode1{
    int data;
    TreeNode1 left;
    TreeNode1 right;

    public TreeNode1(int key){
        data=key;
        left=null;
        right=null;
    }
}

public class PreorderTraversal {
    public static void main(String[] args) {
        TreeNode1 root= new TreeNode1(1);
        root.left= new TreeNode1(2);
        root.right= new TreeNode1(3);
        root.right.left= new TreeNode1(5);

        ArrayList<Integer> list = preorder(root);
        System.out.println(list);
    }
    public static void preorderTraversal(TreeNode1 root, ArrayList<Integer> arr){
        if (root == null){
            return;
        }

        arr.add(root.data);
        preorderTraversal(root.left,arr);
        preorderTraversal(root.right,arr);
    }

    public static ArrayList<Integer> preorder(TreeNode1 root){
        ArrayList<Integer> arr= new ArrayList<>();
        preorderTraversal(root,arr);
        return arr;
    }
}

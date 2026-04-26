package Trees;

import java.util.ArrayList;

class TreeNode2{
    int data;
    TreeNode2 left;
    TreeNode2 right;

    public TreeNode2(int key){
        data=key;
        left=null;
        right=null;
    }
}

public class PostorderTraversal {

    public static void main(String[] args) {
        TreeNode2 root=new TreeNode2(1);
        root.left=new TreeNode2(2);
        root.right=new TreeNode2(3);
        root.right.left=new TreeNode2(5);

        ArrayList<Integer> list = postorder(root);
        System.out.println(list);
    }
    public static void postorderTraversal(TreeNode2 root, ArrayList<Integer> list){
        if (root == null){
            return;
        }

        postorderTraversal(root.left,list);
        postorderTraversal(root.right,list);
        list.add(root.data);
    }

    public static ArrayList<Integer> postorder(TreeNode2 root){
        ArrayList<Integer> list= new ArrayList<>();
        postorderTraversal(root,list);
        return list;
    }
}

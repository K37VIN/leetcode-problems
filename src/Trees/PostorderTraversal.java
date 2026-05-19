package Trees;

import java.util.ArrayList;

class TreeNode2{
    int data;
    TreeNode2 left;
    TreeNode2 right;

    TreeNode2(int key){
        data = key;
    }
}

public class PostorderTraversal {

    public static void postOrder(TreeNode2 root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        postOrder(root.left, list);
        postOrder(root.right, list);
        list.add(root.data);
    }


    public static ArrayList<Integer> printTree(TreeNode2 root){
        ArrayList<Integer> list = new ArrayList<>();
        postOrder(root,list);
        return list;
    }
}


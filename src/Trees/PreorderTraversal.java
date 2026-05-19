package Trees;


import java.util.ArrayList;

class  TreeNode1{
    int data;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class PreorderTraversal {
    public static void preorderTraversal(TreeNode1 root, ArrayList<Integer> list){
        if (root == null){
            return;
        }
        list.add(root.data);
        preorderTraversal(root.left,list);
        preorderTraversal(root.right,list);
    }


    public ArrayList<Integer> printTree(TreeNode1 root){
        ArrayList<Integer> list = new ArrayList<>();
        preorderTraversal(root,list);
        return list;
    }
}

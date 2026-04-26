package Trees;


class TreeNode4 {
    int data;
    TreeNode4 left;
    TreeNode4 right;

    public TreeNode4(int key){
      data=key;
      left=null;
      right=null;
    }
}
public class TreeRepresentation {

    public static void main(String[] args) {
        TreeNode4 root=createBinaryTree();
    }

    public static TreeNode4 createBinaryTree(){
        TreeNode4 root=new TreeNode4(1);
        root.left=new TreeNode4(2);
        root.right=new TreeNode4(3);
        root.right.left=new TreeNode4(5);

        return root;
    }
}

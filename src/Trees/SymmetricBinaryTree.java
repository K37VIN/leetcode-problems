package Trees;

class TreeNode14{
    int data;
    TreeNode14 left;
    TreeNode14 right;


    public TreeNode14(int key){
        data=key;
    }
}

public class SymmetricBinaryTree {

    public static void main(String[] args) {
        TreeNode14 root = new TreeNode14(1);
        root.left = new TreeNode14(2);
        root.right = new TreeNode14(2);
        root.left.left = new TreeNode14(3);
        root.right.right = new TreeNode14(3);
        root.left.right = new TreeNode14(4);
        root.right.left = new TreeNode14(4);


        boolean res=isSymmetric(root);

        if (res){
            System.out.println("The tree is symmetric");
        }
        else{
            System.out.println("The tree is not symmetric");
        }

    }
    public static boolean symmetricBinaryTree(TreeNode14 root1,TreeNode14 root2){
        if (root1 == null || root2 ==null){
            return root1 == root2;
        }

        return (root1.data == root2.data) && symmetricBinaryTree(root1.left,root2.right) && symmetricBinaryTree(root1.right,root2.left);

    }

    public static boolean isSymmetric(TreeNode14 root){
        if(root == null){
            return true;
        }

        return symmetricBinaryTree(root.left,root.right);
    }
}

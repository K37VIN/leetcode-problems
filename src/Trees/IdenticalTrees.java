package Trees;

class TreeNode9{
    int data;
    TreeNode9 left;
    TreeNode9 right;

    public TreeNode9(int key){
        data=key;
        left=null;
        right=null;
    }
}

public class IdenticalTrees {

    public static void main(String[] args) {
        TreeNode9 root1 = new TreeNode9(1);
        root1.left = new TreeNode9(2);
        root1.right = new TreeNode9(3);
        root1.left.left = new TreeNode9(4);
        root1.left.right = new TreeNode9(5);
        root1.left.right.right = new TreeNode9(6);
        root1.left.right.right.right = new TreeNode9(7);

        TreeNode9 root2 = new TreeNode9(1);
        root2.left = new TreeNode9(2);
        root2.right = new TreeNode9(3);
        root2.left.left = new TreeNode9(4);
        root2.left.right = new TreeNode9(5);
        root2.left.right.right = new TreeNode9(6);
        root2.left.right.right.right = new TreeNode9(7);


        boolean identical=checkIdenticalTrees(root1,root2);

        if (identical == true){
            System.out.println("The trees are identical");
        }
        else{
            System.out.println("The trees are not identical");
        }
    }
    public static boolean checkIdenticalTrees(TreeNode9 root1,TreeNode9 root2){
        if (root1 == null && root2 == null){
            return true;
        }

        if (root1 == null || root2 == null){
            return false;
        }

        if(root1.data != root2.data){
            return false;
        }
        return checkIdenticalTrees(root1.left,root2.left) && checkIdenticalTrees(root1.right,root2.right);

    }
}

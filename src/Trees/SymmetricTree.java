package Trees;



import java.util.*;


class TreeNode5{
    int data;
    TreeNode5 left;
    TreeNode5 right;

    TreeNode5(int key){
        data = key;
    }

}
public class SymmetricTree {


    public static boolean symmetricTree(TreeNode5 root1,TreeNode5 root2){
        if (root1 == null && root2 == null){
            return true;
        }
        if (root1 == null || root2 == null){
            return false;
        }

        if (root1.data != root2.data){
            return false;
        }


        return symmetricTree(root1.left,root2.right) && symmetricTree(root1.right,root2.left);


    }


    public static boolean isSymmetric(TreeNode5 root){
        if (root == null){
            return true;
        }
        boolean isSym = symmetricTree(root.left,root.right);

        return isSym;
    }
}

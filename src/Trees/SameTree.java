package Trees;

class TreeNode4 {
    int data;
    TreeNode4 left;
    TreeNode4 right;

    TreeNode4(int key) {
        data = key;
    }
}

public class SameTree {

    public static boolean sameTree(TreeNode4 root1, TreeNode4 root2) {

        // both are null
        if (root1 == null && root2 == null) {
            return true;
        }

        // one is null, other is not
        if (root1 == null || root2 == null) {
            return false;
        }

        // values must match
        if (root1.data != root2.data) {
            return false;
        }

        // recursively compare left and right
        return sameTree(root1.left, root2.left)
                && sameTree(root1.right, root2.right);
    }
}

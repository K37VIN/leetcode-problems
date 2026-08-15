package Trees;

class TreeNode18{
    int data;
    TreeNode18 left;
    TreeNode18 right;



    TreeNode18(int key){
        data = key;
    }
}

public class PathSum1 {


    public boolean pathSumI(TreeNode18 root,int target){
        if (root == null){
            return false;
        }

        target -= root.data;

        if (root.left == null && root.right == null){
            return target == 0;
        }

        return pathSumI(root.left,target) || pathSumI(root.right,target);
    }

}

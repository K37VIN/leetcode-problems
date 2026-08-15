package Trees;


class TreeNode20{
    int data;
    TreeNode20 left;
    TreeNode20 right;


    TreeNode20(int key){
        data = key;
    }
}

public class SumRootToLeafNumbers {

    public int sumOfNumbers(TreeNode20 root){
        dfs(root,0);
    }

    private int dfs(TreeNode20 root,int curr){
        if (root == null){
            return 0;
        }

        curr = curr*10 + root.data;

        if (root.left == null && root.right == null){
            return curr;
        }

        return dfs(root.left,curr) + dfs(root.right,curr);
    }
}

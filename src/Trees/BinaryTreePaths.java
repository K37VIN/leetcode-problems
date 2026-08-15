package Trees;

import java.util.*;

class TreeNode21{
    int data;
    TreeNode21 left;
    TreeNode21 right;

    TreeNode21(int key){
        data = key;
    }
}

public class BinaryTreePaths {
    List<String> ans = new ArrayList<>();

    public List<String> treePaths(TreeNode21 root){
        dfs(root,"");
        return ans;
    }


    private void dfs(TreeNode21 root,String path){
        if (root  == null){
            return;
        }

        path += root.data;

        if (root.left == null && root.right == null){
            ans.add(path);

            return;
        }

        path += "->";

        dfs(root.left,path);
        dfs(root.right,path);
    }
}

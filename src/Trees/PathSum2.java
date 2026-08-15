package Trees;

import java.util.*;

class TreeNode19{
    int data;
    TreeNode19 left;
    TreeNode19 right;

    TreeNode19(int key){
        data = key;
    }
}
public class PathSum2 {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> pathSumII(TreeNode19 root,int target){
        dfs(root,target,new ArrayList<>());

        return ans;
    }

    private void dfs(TreeNode19 root,int target,List<Integer> path){
        if (root == null){
            return;
        }

        path.add(root.data);

        if (root.left == null && root.right == null && target == root.data){
            ans.add(new ArrayList<>(path));
        }

        dfs(root.left,target - root.data,path);
        dfs(root.right,target - root.data, path);

        path.remove(path.size() - 1);



    }
}

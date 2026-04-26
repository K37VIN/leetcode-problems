package Trees;

import java.util.*;
class TreeNode15{
    int data;
    TreeNode15 left;
    TreeNode15 right;

    public TreeNode15(int key){
        data=key;
    }
}
public class PrintRootToNodePath {
    public static void main(String[] args) {
        TreeNode15 root = new TreeNode15(3);
        root.left = new TreeNode15(5);
        root.right = new TreeNode15(1);
        root.left.left = new TreeNode15(6);
        root.left.right = new TreeNode15(2);
        root.right.left = new TreeNode15(0);
        root.right.right = new TreeNode15(8);
        root.left.right.left = new TreeNode15(7);
        root.left.right.right = new TreeNode15(4);

        int x=7;
        ArrayList<Integer> ans=pathPrint(root,x);
        System.out.println(ans);
    }
    public static boolean nodePath(TreeNode15 root,ArrayList<Integer>arr,int x){
        if(root == null){
            return false;
        }

        arr.add(root.data);
        if (root.data == x){
            return true;
        }

        if (nodePath(root.left,arr,x) || nodePath(root.right,arr,x)){
            return true;
        }

        arr.remove(arr.size()-1);
        return false;
    }

    public static ArrayList<Integer> pathPrint(TreeNode15 root,int x){
        ArrayList<Integer> arr=new ArrayList<>();
        if (root==null){
            return arr;
        }

        nodePath(root,arr,x);
        return arr;
    }
}

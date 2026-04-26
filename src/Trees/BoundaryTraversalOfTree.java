package Trees;

import java.util.ArrayList;

class TreeNode11{
    int data;
    TreeNode11 left;
    TreeNode11 right;

    public TreeNode11(int key){
       data=key;
       left=null;
       right=null;
    }
}

public class BoundaryTraversalOfTree {


    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode11 root = new TreeNode11(1);
        root.left = new TreeNode11(2);
        root.right = new TreeNode11(3);
        root.left.left = new TreeNode11(4);
        root.left.right = new TreeNode11(5);
        root.right.left = new TreeNode11(6);
        root.right.right = new TreeNode11(7);


        ArrayList<Integer> result =boundaryTraversalOfTree(root);

        System.out.println(result);
    }

    public static boolean isLeaf(TreeNode11 root){
        return root.left==null && root.right==null;
    }

    public static void addLeftBoundary(TreeNode11 root,ArrayList<Integer> res){
        TreeNode11 curr=root.left;
        while(curr!=null){

            if (!isLeaf(curr)){
                res.add(curr.data);
            }

            if (curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }

    public static void addRightBoundary(TreeNode11 root,ArrayList<Integer> res){
        TreeNode11 curr=root.right;
        ArrayList<Integer> temp=new ArrayList<>();

        while(curr!=null) {

            if (!isLeaf(curr)) {
                temp.add(curr.data);
            }


            if (curr.right != null) curr = curr.right;
            else curr = curr.left;
        }

        for(int i=temp.size()-1;i>=0;i--){
            res.add(temp.get(i));
        }

    }

    public static void addLeaves(TreeNode11 root,ArrayList<Integer> res){
            if (isLeaf(root)) {
                res.add(root.data);
            }

            if (root.left!=null){
                addLeaves(root.left,res);
            }

            if (root.right!=null){
                addLeaves(root.right,res);
            }
    }
    public static ArrayList<Integer> boundaryTraversalOfTree(TreeNode11 root){
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }

        if(!isLeaf(root)){
            res.add(root.data);
        }

        addLeftBoundary(root,res);
        addLeaves(root,res);
        addRightBoundary(root,res);

        return res;
    }
}

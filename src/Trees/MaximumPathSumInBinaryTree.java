package Trees;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode8{
    int data;
    TreeNode8 left;
    TreeNode8 right;


    public TreeNode8(int key){
        data=key;
        left=null;
        right=null;
    }
}

public class MaximumPathSumInBinaryTree {


    public static void main(String[] args) {
        TreeNode8 root = new TreeNode8(1);
        root.left = new TreeNode8(2);
        root.right = new TreeNode8(3);
        root.left.left = new TreeNode8(4);
        root.left.right = new TreeNode8(5);
        root.left.right.right = new TreeNode8(6);
        root.left.right.right.right = new TreeNode8(7);


        int maximumSum=maxPathSumInTree(root);

        System.out.println(maximumSum);
    }
    public static int maxPathSumInTree(TreeNode8 root) {
        if (root == null) return 0;

        int maxSum = Integer.MIN_VALUE;
        Queue<TreeNode8> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode8 node = q.poll();

            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);


            int leftMax = maxPathDown(node.left);
            int rightMax = maxPathDown(node.right);

            int currentSum = node.data + leftMax + rightMax;

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }


    private static int maxPathDown(TreeNode8 node) {
        if (node == null) return 0;
        int left = Math.max(0, maxPathDown(node.left));
        int right = Math.max(0, maxPathDown(node.right));
        return node.data + Math.max(left, right);
    }

}

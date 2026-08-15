package Trees;

public class CountGoodNodes {
}



//class Solution {
//
//    int count = 0;
//
//    public int goodNodes(TreeNode root) {
//
//        dfs(root, Integer.MIN_VALUE);
//
//        return count;
//    }
//
//    private void dfs(TreeNode node, int maxSoFar) {
//
//        if (node == null) return;
//
//        // current node is good
//        if (node.val >= maxSoFar)
//            count++;
//
//        // update max for children
//        maxSoFar = Math.max(maxSoFar, node.val);
//
//        dfs(node.left, maxSoFar);
//        dfs(node.right, maxSoFar);
//    }
//}

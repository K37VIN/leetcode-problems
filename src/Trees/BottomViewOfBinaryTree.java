package Trees;

import java.util.*;
class TreeNode13 {
    int data;
    TreeNode13 left, right;

    public TreeNode13(int key) {
        data = key;
    }
}

class Pair1 {
    TreeNode13 node;
    int vertical;

    public Pair1(TreeNode13 node, int vertical) {
        this.node = node;
        this.vertical = vertical;
    }
}

public class BottomViewOfBinaryTree {
    public static List<Integer> bottomOfBinaryTree(TreeNode13 root){
        List<Integer> ans=new ArrayList<>();

        if (root == null){
            return ans;
        }

        Map<Integer,Integer> mpp=new TreeMap<>();
        Queue<Pair1> q=new LinkedList<>();
        q.add(new Pair1(root,0));

        while(!q.isEmpty()){
            Pair1 pair=q.poll();
            TreeNode13 node=pair.node;
            int level=pair.vertical;

            mpp.put(level,node.data);

            if (node.left!=null){
                q.add(new Pair1(node.left,level-1));
            }
            if (node.right!=null){
                q.add(new Pair1(node.right,level+1));
            }
        }
        ans.addAll(mpp.values());

        return ans;
    }
}

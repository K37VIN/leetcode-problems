package Trees;

import java.util.*;
class TreeNode16{
    int data;
    TreeNode16 left;
    TreeNode16 right;

    public TreeNode16(int key){
        data=key;
        left=right=null;
    }
}

class Pair2{
    TreeNode16 node;
    int index;

    public Pair2(TreeNode16 node,int index){
        this.node=node;
        this.index=index;
    }

}

public class MaximumWidthInBinaryTree {
    public static int maximumWidthInBinaryTree(TreeNode16 root){

        if (root == null){
            return 0;
        }

        Queue<Pair2> q=new LinkedList<>();
        q.add(new Pair2(root,0));
        int maxWidth=0;
        int last=0;
        int first=0;

        while(!q.isEmpty()){
            int size=q.size();
            int minIndex=q.peek().index;

            for(int i=0;i<size;i++){
                Pair2 pair = q.poll();
                TreeNode16 node=pair.node;
                int currIndex=pair.index-minIndex;

                if (i == 0){
                    first=currIndex;
                }

                if (i == size-1){
                    last=currIndex;
                }

                if (node.left!=null){
                    q.add(new Pair2(node.left,2*currIndex+1));
                }
                if (node.right!=null){
                    q.add(new Pair2(node.right,2*currIndex+2));
                }
            }
            maxWidth=Math.max(maxWidth,last-first+1);

        }

        return maxWidth;

    }
}

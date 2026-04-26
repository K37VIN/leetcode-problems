package Trees;

import java.util.*;
class TreeNode12{
    int data;
    TreeNode12 left;
    TreeNode12 right;

    public TreeNode12(int key){
        data=key;
        left=null;
        right=null;
    }
}

class Tuple{
    TreeNode12 node;
    int vertical;
    int level;

    public Tuple(TreeNode12 _node,int _vertical,int _level){
        node=_node;
        vertical=_vertical;
        level=_level;
    }
}

public class VerticalOrderTraversal {

    public static void main(String[] args) {
        // Create sample binary tree
        TreeNode12 root = new TreeNode12(1);
        root.left = new TreeNode12(2);
        root.left.left = new TreeNode12(4);
        root.left.right = new TreeNode12(10);
        root.left.left.right = new TreeNode12(5);
        root.left.left.right.right = new TreeNode12(6);
        root.right = new TreeNode12(3);
        root.right.right = new TreeNode12(10);
        root.right.left = new TreeNode12(9);

        // Call function
        ArrayList<ArrayList<Integer>> verticalTraversal = verticalOrderTraversal(root);

        for (int i = 0; i < verticalTraversal.size(); i++) {
            for (Integer val : verticalTraversal.get(i)) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }
   public static ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode12 root){
       TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
       Queue<Tuple> q=new LinkedList<>();

       q.offer(new Tuple(root,0,0));

       while(!q.isEmpty()){
           Tuple tuple=q.poll();
           TreeNode12 node=tuple.node;
           int x = tuple.vertical;
           int y = tuple.level;

           if (!map.containsKey(x)){
               map.put(x,new TreeMap<>());
           }
           if (!map.get(x).containsKey(y)){
               map.get(x).put(y,new PriorityQueue<>());
           }

           map.get(x).get(y).offer(node.data);

           if (node.left!=null){
               q.offer(new Tuple(node.left,x-1,y+1));
           }

           if(node.right!=null){
               q.offer(new Tuple(node.right,x+1,y+1));
           }
       }
       ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
       for(TreeMap<Integer,PriorityQueue<Integer>> ys:map.values()){
           ans.add(new ArrayList<>());
           for (PriorityQueue<Integer> pq:ys.values()){
               while(!pq.isEmpty()){
                   ans.get(ans.size()-1).add(pq.poll());
               }
           }
       }

       return ans;
   }

}

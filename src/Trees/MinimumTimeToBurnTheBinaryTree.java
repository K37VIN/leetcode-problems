package Trees;


import java.util.*;


class TreeNode19{
    int data;
    TreeNode19 left;
    TreeNode19 right;

    public TreeNode19(int key){
        data=key;
        left=null;
        right=null;
    }
}

public class MinimumTimeToBurnTheBinaryTree {
    public static int minTime(TreeNode19 root,int target){
        Map<Integer,List<Integer>> graph = new HashMap<>();
        buildGraph(root,null,graph);
        Set<Integer> visited=new HashSet<>();

        Queue<Integer> q=new LinkedList<>();
        q.offer(target);
        visited.add(target);

        int time=0;

        while(!q.isEmpty()){
            int size=q.size();
            boolean burned=false;

            for (int i=0;i<size;i++){
                int node=q.poll();

                for (int neighbour:graph.getOrDefault(node,new ArrayList<>())){
                    if (!visited.contains(neighbour)){
                        visited.add(neighbour);
                        q.offer(neighbour);
                        burned=true;
                    }
                }
            }
            if (burned)
                time++;

        }

    return time;
    }
    private static void buildGraph(TreeNode19 node, TreeNode19 parent, Map<Integer, List<Integer>> graph) {
        // Base case: if current node is null, return
        if (node == null) return;

        // If parent exists, add bidirectional connection
        if (parent != null) {
            graph.computeIfAbsent(node.data, k -> new ArrayList<>()).add(parent.data);
            graph.computeIfAbsent(parent.data, k -> new ArrayList<>()).add(node.data);
        }

        // Recursively build graph for left and right children
        buildGraph(node.left, node, graph);
        buildGraph(node.right, node, graph);
    }
}

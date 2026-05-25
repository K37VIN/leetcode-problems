package Trees;

import java.util.*;

class TreeNode16{
    int data;
    TreeNode16 left;
    TreeNode16 right;

    TreeNode16(int key){
        data = key;
    }
}

public class BinaryTreeTilt{

     int tilt = 0;
     public int treeTilt(TreeNode16 root){
          if (root == null){
              return 0;
          }

          int left =treeTilt(root.left);
          int right =treeTilt(root.right);
          tilt +=  Math.abs(left - right);

          return left + right + root.data;
     }
}

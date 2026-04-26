package StacksAndQueues;
import java.util.*;

public class CircularNextGreaterElement {

    public static void main(String[] args) {
        int[] nums = {1,3,4,2};
        Map<Integer,Integer> result = CircularNGE(nums);
        System.out.println(result);
    }
    public static Map<Integer,Integer> CircularNGE(int[] arr){

        int len = arr.length;
        Map<Integer,Integer> mp=new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0;i< 2*len;i++){
            int idx=i % len;

            while (!st.isEmpty() && arr[idx] > arr[st.peek()]){
                mp.put(arr[st.pop()],arr[idx]);
            }
            if (i < len){
                st.push(idx);
            }

        }
        while(!st.isEmpty()){
            mp.put(arr[st.pop()],-1);
        }

        return mp;

    }
}

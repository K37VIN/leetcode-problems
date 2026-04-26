package StacksAndQueues;
import java.util.*;

public class NextSmallerElement {

    public static void main(String[] args) {
        int[] arr= {3,1,4,2};
        Map<Integer,Integer> result = NSE(arr);
        System.out.println(result);
    }
    public static Map<Integer,Integer> NSE(int[] arr){
        int len = arr.length;
        Map<Integer,Integer> mp=new HashMap<>();
        Stack<Integer> st= new Stack<>();

        for (int i = 0; i < len-1; i++ ){
            while(!st.isEmpty() && arr[i] < st.peek()){
                mp.put(st.pop(),arr[i]);
            }
            st.push(arr[i]);
        }

        while (!st.isEmpty()){
            mp.put(st.pop(),-1);
        }

        return mp;
    }
}

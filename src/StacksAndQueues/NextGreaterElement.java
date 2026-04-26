package StacksAndQueues;
import java.util.*;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] nums = {1,3,4,2};
        Map<Integer,Integer> result = NGE(nums);
        System.out.println(result);
    }

    public static Map<Integer,Integer> NGE(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!st.isEmpty() && arr[i] > st.peek()) {
                mp.put(st.pop(), arr[i]);
            }
            st.push(arr[i]);
        }

        while (!st.isEmpty()) {
            mp.put(st.pop(), -1);
        }

        return mp;
    }


}

package Strings;

import java.util.Stack;

public class removeConsecutiveDuplicates {
    public static void main(String[] args) {
        String str = "aazbbby";
        int n = 7;
        removeConsecutiveDuplicates(str, n);

    }

    public static void removeConsecutiveDuplicates(String str, int n) {
        Stack<Character> stack = new Stack<>();
        char[] arr = str.toCharArray();

        if (n == 0) return;


        stack.push(arr[0]);


        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                stack.push(arr[i]);
            }
        }


        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb.reverse().toString());
    }


}

package StacksAndQueues;
import java.util.*;
public class TrappingRainwater {

    public static void main(String[] args){

        int[] height = {4,2,0,3,2,5};

        int result = trappingRainwater(height);

        System.out.println("Total water trapped = " + result);
    }


    public static int trappingRainwater(int[] height){
        int n=height.length;
        int sum = 0;
        int[] leftMax=leftMaximum(height);
        int[] rightMax=rightMaximum(height);


        for(int i = 0;i<n;i++){
            int water=Math.min(leftMax[i],rightMax[i]) - height[i];
            sum+=water;
        }

        return sum;
    }


    public static int[] leftMaximum(int[] height){
        int n = height.length;
        int[] leftMax=new int[n];

        leftMax[0] = height[0];

        for(int i = 1;i < n;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }

        return leftMax;
    }

    public static int[] rightMaximum(int[] height){
        int n = height.length;
        int[] rightMax=new int[n];

        rightMax[n-1] = height[n-1];
        for (int i = n-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }

        return rightMax;
    }


}

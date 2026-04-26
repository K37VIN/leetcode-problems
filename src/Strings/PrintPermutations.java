package Strings;

import java.util.*;
public class PrintPermutations {
    public static void main(String[] args) {
        String str="abc";
        printAllPermutations(str.toCharArray(),0);
    }

    public static void printAllPermutations(char[] str,int index){
        if(index==str.length-1){
            System.out.println(String.valueOf(str));
            return;
        }

        for(int i=index;i<str.length;i++){
            swap(str,index,i);

            printAllPermutations(str,index+1);

            swap(str,index,i);

        }
    }

    public static void swap(char[] str,int i,int j){
        char temp=str[i];
        str[i]=str[j];
        str[j]=temp;
    }


}

package Strings;


// string subsequences requires a concept of recursive calls using a technique called "Taken and Not Taken":means we would be doing two recursion calls,one where we will be accepting a character into the sequence(taken) and one in which we won't be considering the character in the subsequence(Not taken)
public class subsequencesOfString {
    public static void main(String[] args){
        String str="abc";
        int i = 0;
        String curr="";
        printSubsequences(str,i,curr);
    }


    public static void printSubsequences(String str,int i,String curr){
        char[] arr=str.toCharArray();
        int len=arr.length;
        if (i==len){
            System.out.println(curr);
            return;
        }
        printSubsequences(str,i+1,curr+arr[i]);
        printSubsequences(str,i+1,curr);
    }
}

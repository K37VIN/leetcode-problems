package Strings;

import java.util.*;

public class longestRepeatingSubsequence {
    public static void main(String[] args) {
      String str="ab";

      //returns the length of the longest repeating subsequence in the given string
      int subsequenceLen=longestRepeatedSubsequence(str);
      System.out.println(subsequenceLen);
    }

    public static int longestRepeatedSubsequence(String str){
        int i=0;
        String curr="";
        ArrayList<String> subsequences=generateAllSubsequences(str,i,curr);
        int maxlen=0;
        Set<String> set=new HashSet<>(subsequences);
        Map<String,Integer> index=new HashMap<>();

        int p=0;
        for (String st:set){
            index.put(st,p++);
        }

        int[] freq=new int[set.size()];
        for(String s:subsequences){
            freq[index.get(s)]++;
        }

        for(Map.Entry<String,Integer> e:index.entrySet()){
            if (freq[e.getValue()] > 1){
                if(e.getKey().length() > maxlen ){
                    maxlen=e.getKey().length();
                }
            }
        }

        for(Map.Entry<String,Integer> e:index.entrySet()){
            if (freq[e.getValue()] > 1 && e.getKey().length() == maxlen){
                return e.getKey().length();
            }
        }
       return 0;

    }

    public static ArrayList<String> generateAllSubsequences(String str,int i,String curr){
        char[] arr=str.toCharArray();
        int n=arr.length;
        ArrayList<String> subsequences=new ArrayList<>();
        if (i==n-1){
            subsequences.add(curr);
            return subsequences;
        }

        ArrayList<String> include=generateAllSubsequences(str,i+1,curr+arr[i]);
        ArrayList<String> exclude=generateAllSubsequences(str,i+1,curr);


        //for adding one arraylist to another we can use the ArrayList.addAll(ArrayList1) method.
        subsequences.addAll(include);
        subsequences.addAll(exclude);

        return subsequences;
    }
}

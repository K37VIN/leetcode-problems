package Strings;

import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class secondMostRepeatedWord {
    public static void main(String[] args) {
        String[] arr={"aa","bb","aa"};
        secondMostRepeated(arr);

    }

    public static void secondMostRepeated(String[] arr){
        Set<String> set=new HashSet<>(Arrays.asList(arr));
        Map<String,Integer> index=new HashMap<>();

        int i=0;
        for (String st:set){
            index.put(st,i++);
        }

        int[] freq=new int[set.size()];
        for(String s:arr){
            freq[index.get(s)]++;
        }

        int max1=0,max2=0;

        for (int f:freq){
            if (f>max1){
                max2=max1;
                max1=f;
            } else if (f>max2 && f<max1){
                max2=f;
            }

        }
        String secondMost=null;
        for(Map.Entry<String,Integer> e:index.entrySet()){
            if(freq[e.getValue()]==max2){
                secondMost=e.getKey();
                break;
            }
        }
        System.out.println(secondMost);
    }
}

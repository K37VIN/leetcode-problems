package Arrays;

import javax.naming.ldap.LdapReferralException;

public class minWaysToMakePalindrome {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1};
        int merges=minNumberOfMerges(arr);
        System.out.println(merges);
    }

    public static int minNumberOfMerges(int[] arr){
        int i = 0,j=arr.length-1;
        int merges=0;
        while(i<j){
            if (arr[i]==arr[j]){
                i++;
                j--;
            }
            if (arr[i]<arr[j]){
                arr[i]=arr[i]+arr[i+1];
                merges+=1;
                j--;
            }
            if (arr[j]<arr[i]){
                arr[j]=arr[j]+arr[j-1];
                merges+=1;
                j--;
            }
        }
        return merges;
    }
}

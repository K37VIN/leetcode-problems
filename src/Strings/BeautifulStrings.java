package Strings;


public class BeautifulStrings {
    public static void main(String[] args) {
        String str="1010";
        int ops=numberOfOperationsForBeautifulString(str);
        System.out.println(ops);
    }

    public static int numberOfOperationsForBeautifulString(String str){
        char[] arr=str.toCharArray();
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            if (arr[i]==arr[i+1]){
               if (arr[i] == '1'){
                   arr[i+1]='0';
               }
               else{
                   arr[i+1]='1';
               }
               count++;
            }
        }

        return count;
    }
}

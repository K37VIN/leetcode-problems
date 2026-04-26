package Strings;

public class checkIfOneStringIsRotationOfAnother {
    public static void main(String[] args){
        String p="caba";
        String q="baca";
        int res=checkString(p,q);
        if (res == 1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

    public static int checkString(String p,String q){
        if (p.length()!=q.length()){
            return 0;
        }

        for(int i=0;i<p.length();i++){
            p=rotateString(p,1);
            if (p.equals(q)) {
                return 1;
            }

        }
        return 0;
    }


    public static void reverse(char[] arr,int l,int r){
        char temp;
        while(l<r){
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }


    public static String rotateString(String s,int k){
         char[] arr=s.toCharArray();
         int len=arr.length;
         k=k%len;

         reverse(arr,0,len-1);
         reverse(arr,0,k-1);
         reverse(arr,k,len-1);

         return new String(arr);
    }

}

package Strings;


public class RearrangeCharacters {
    public static void main(String[] args) {
        String str="aaabc";
        rearrangeTheCharacters(str.toCharArray(),0);
    }

    public static void rearrangeTheCharacters(char[] arr,int index){

        if (index==arr.length-1){
            boolean ok=true;
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]==arr[j+1]){
                    ok=false;
                    break;
                }
            }
            if (ok){
                System.out.println(1);

            }
            else{
                System.out.println(0);
            }

            return;

        }
        for(int i=index;i<arr.length;i++){
            swap(arr,index,i);

            rearrangeTheCharacters(arr,index+1);

            swap(arr,index,i);
        }


    }

    public static void swap(char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

package Arrays;

public class mergeWithExtraSpace {
    public static void main(String[] args){
        int[] arr1={2,4,7,10};
        int[] arr2={2,3};
        mergeWithSpace(arr1,arr2);
    }

    public static void mergeWithSpace(int[] arr1, int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int n3=n1+n2;
        int[] arr3=new int[n3];
        int i=0,j=0;
        int k=0;
        while(i<n1 && j<n2){
            if (arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }


        while(i<n1){
            arr3[k]=arr1[i];
            i++;
            k++;
        }

        while(j<n2){
            arr3[k]=arr2[j];
            j++;
            k++;
        }

        for(int p=0;p<n3;p++){
            System.out.println(arr3[p]);
        }


    }
}

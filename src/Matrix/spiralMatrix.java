package Matrix;

public class spiralMatrix {
    public static void main(String[] args){
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n=4;
        int m=4;
        printSpiralMatrix(matrix,n,m);
    }

    public static void printSpiralMatrix(int[][] matrix,int n,int m){
       int top=0,bottom= n-1;
       int left=0,right=m-1;
       while (top<=bottom && left<=right){
           for(int i=left;i<=right;i++){
               System.out.println(matrix[top][i]);
           }
           top++;

           for(int i=top;i<=bottom;i++){
               System.out.println(matrix[i][right]);
           }
           right--;

           if (top<=bottom){
           for(int i=right;i>=left;i--){
               System.out.println(matrix[bottom][i]);
           }
           bottom--;
           }

           if (left<=right){
               for(int i=bottom;i>=top;i--){
                   System.out.println(matrix[i][left]);
               }
           }

           left++;



       }

    }
}

package Matrix;

public class search2DMatrix {
    public static void main(String[] args){
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        int n=3;
        int m=4;
        boolean search=searchMatrix(matrix,target,n,m);
        System.out.println(search);
    }

    public static boolean searchMatrix(int[][] matrix,int target,int n,int m) {
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
       return false;
    }
}

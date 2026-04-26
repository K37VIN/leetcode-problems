package StacksAndQueues;

public class CelebrityProblem {


    public static void main(String[] args) {
        int[][] M = {
                {0,1,0},
                {0,0,0},
                {0,1,0}
        };

        int n = M.length;

        int result = findCelebrity(M,n);

        if(result == -1)
            System.out.println("No Celebrity");
        else
            System.out.println("Celebrity is person " + result);

    }

    public static int findCelebrity(int[][] M,int n){
        int i = 0;
        int j = n - 1;

        // Step 1: Elimination
        while(i < j) {

            if(M[i][j] == 1) {
                i++;        // i knows j → i cannot be celebrity
            }
            else {
                j--;        // i doesn't know j → j cannot be celebrity
            }
        }

        int candidate = i;

        // Step 2: Verification

        for(int k = 0; k < n; k++) {

            if(k != candidate) {

                // candidate should know nobody
                if(M[candidate][k] == 1)
                    return -1;

                // everyone should know candidate
                if(M[k][candidate] == 0)
                    return -1;
            }
        }

        return candidate;
    }
}

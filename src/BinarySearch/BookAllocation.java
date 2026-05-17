package BinarySearch;

public class BookAllocation {
    private int studentBookAllocation(int[] books, int pages){

        int students = 1;
        int totalPages = 0;
        for (int i = 0;i<books.length;i++){
            if (totalPages + books[i] <= pages){
                totalPages+=books[i];
            }
            else{
                students++;
                totalPages = books[i];
            }
        }

        return students;
    }

    public int getPages(int[] books,int m,int n){
        if (m > n){
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            low = Math.max(low,books[i]);
            high += books[i];
        }

        while (low < high){
            int mid = low + (high - low)/2;
            int students = studentBookAllocation(books,mid);
            if (students <= m){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }
}

package BinarySearch;


//import java.util.*;
//public class KClosestElements {
//
//    public List<Integer> kClosestElements(int[] arr,int k, int x){
//
//        List<int[]> ls = new ArrayList<>();
//        for (int num: arr){
//            int diff = Math.abs(x - num);
//            ls.add(new int[]{diff,num});
//
//        }
//
//        Collections.sort(ls,(a,b) ->{
//            if (a[0] == b[0]){
//                return a[1] - b[1];
//            }
//            return a[0] - b[0];
//        });
//
//
//        List<Integer> ans = new ArrayList<>();
//        for (int i =0;i<k;i++){
//            ans.add(ls.get(i)[1]);
//        }
//
//
//        Collections.sort(ans);
//
//        return ans;
//    }
//
//
//}






import java.util.*;

class Solution {

    public List<Integer> findClosestElements(
            int[] arr,
            int k,
            int x
    ) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(
                        (a, b) -> {

                            int distA = Math.abs(a - x);
                            int distB = Math.abs(b - x);

                            if (distA == distB) {

                                return b - a;
                            }

                            return distB - distA;
                        }
                );

        for (int num : arr) {

            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            ans.add(pq.poll());
        }

        Collections.sort(ans);

        return ans;
    }
}

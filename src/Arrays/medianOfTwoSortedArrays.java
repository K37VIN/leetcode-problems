package Arrays;

public class medianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double median = medianOfTwoArrays(nums1, nums2);
        System.out.println(median);
    }

    public static double medianOfTwoArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n3 = n1 + n2;

        int[] nums3 = new int[n3];

        int i = 0, j = 0, k = 0;

        // merge arrays correctly
        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
        }

        while (i < n1) {
            nums3[k++] = nums1[i++];
        }

        while (j < n2) {
            nums3[k++] = nums2[j++];
        }

        int n = nums3.length;

        if (n % 2 == 1) {
            return nums3[n / 2];           // odd
        } else {
            return (nums3[n / 2 - 1] + nums3[n / 2]) / 2.0;   // even
        }
    }
}

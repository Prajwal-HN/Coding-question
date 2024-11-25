import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}; // {1, 2, 2, 3, 5, 6}
        int[] nusm2 = {2,5,6};
        mergeOptimal(nums1, 3, nusm2, 3);
        System.out.println(Arrays.toString(nums1));

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = nums1.length - nums2.length; i < nums1.length; i++) {
            nums1[i] = nums2[j++];
        }

        Arrays.sort(nums1);
    }

    public static void mergeOptimal(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int index = m + n - 1;
         while (j >= 0) {
             if (nums1[i] > nums2[j]) {
                 nums1[index--] = nums1[i--];
             }
             else {
                 nums1[index--] = nums2[j--];
             }
         }
    }
}

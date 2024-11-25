public class RemoveDuplicatesfromSortedArrayI {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int j : nums) {
            for (int num : nums) {
                if (j == num) {
                    count++;
                }
            }
            if ((long) count > (long) nums.length / 2) {
                return j;
            }
        }
        return -1;
    }
}

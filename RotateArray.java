import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {
    public static void main(String[] args) {
        //[1, 2, 3, 4, 5, 6] => 2
        //[5, 6, 1, 2, 3, 4]

        int[] ints = {1,2,3,4,5,6};
        rotate(ints, 2);
    }
    public static void rotate(int[] nums, int k) {
        int arrayElementsCount = nums.length;
        int inputArrayIndex = arrayElementsCount - 1;

        if (k > arrayElementsCount) {
            k %= arrayElementsCount;
        }
        int[] temp = new int[k];
        int tempIndex = 0;
        for (int i = arrayElementsCount - k; i < arrayElementsCount; i++) {
            temp[tempIndex++] = nums[i];
        }
        tempIndex = inputArrayIndex;
        for (int i = nums.length - k - 1; i >= 0; i--) {
            nums[tempIndex--] = nums[i];
        }

        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {

    }
    public static int removeElement(int[] nums, int val) {
        List<Integer> integers = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                integers.add(nums[i]);
                k++;
            }
        }
        for (int i = 0; i < integers.size(); i++) {
            nums[i] = integers.get(i);
        }
        return k;
    }

    public static int removeElementOpt(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != index) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

}

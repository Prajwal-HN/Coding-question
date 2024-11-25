import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTheIndexOfTheFirstOccurrenceInString {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "xyz"));
        int[] ints = {3, 2, 4};
        int[] ints1 = twoSum(ints, 6);
        System.out.println(Arrays.toString(ints1));
    }
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> integerMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            integerMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (integerMap.containsKey(diff)) {
                return new int[] {integerMap.get(diff), i};
            }
        }
        return null;
    }
}

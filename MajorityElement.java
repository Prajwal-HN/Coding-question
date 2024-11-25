import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> integerMap : map.entrySet()) {
            if (integerMap.getValue()/ 2 > nums.length/2) {
                return integerMap.getValue();
            }
        }
        return -1;
     }
}

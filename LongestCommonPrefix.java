/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[]  st = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(st));
    }
    public static String longestCommonPrefix(String[] strs) {
        String firstIndexElement = strs[0];
        int firstIndexElementStringLength = firstIndexElement.length();
        for (int i = 1; i < strs.length; i++) {
            while (!firstIndexElement.isEmpty()) {
                if (!strs[i].startsWith(firstIndexElement)) {
                    firstIndexElement = firstIndexElement.substring(0, --firstIndexElementStringLength);
                }
                else {
                    break;
                }
            }
        }
        return  firstIndexElement;
    }
}

/**
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 * <p>
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * -231 <= x <= 231 - 1
 * <p>
 * <p>
 * Follow up: Could you solve it without converting the integer to a string?
 */

public class PalindromeNumber {
    public static void main(String[] args) {

    }
    //1234
    public static boolean isPalindrome(int x) {
        int input = x;
        if (x < 0) {
            return false;
        }
        int lastDigit;
        int r = 0;
        while (x != 0) {
            lastDigit = x % 10;
            r = (r * 10) + lastDigit;
            x = x / 10;
        }

        return input == r ;
    }
}



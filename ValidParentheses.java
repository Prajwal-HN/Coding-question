import java.util.Stack;

/**Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 An input string is valid if:

 Open brackets must be closed by the same type of brackets.
 Open brackets must be closed in the correct order.
 Every close bracket has a corresponding open bracket of the same type.


 Example 1:

 Input: s = "()"

 Output: true

 Example 2:

 Input: s = "()[]{}"

 Output: true

 Example 3:

 Input: s = "(]"

 Output: false

 Example 4:

 Input: s = "([])"

 Output: true

*/
public class ValidParentheses {
    public static void main(String[] args) {
        String inputString = "))";
        System.out.println(isValid(inputString));
    }

    public static boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();
        char[] charArray = s.toCharArray();
        for (Character stringCharArray : charArray) {
            switch (stringCharArray) {
                case '(':
                case '{':
                case '[':
                    characters.push(stringCharArray);
                    break;
                case ')':
                    if (characters.isEmpty() || characters.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (characters.isEmpty() || characters.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (characters.isEmpty() || characters.pop() != '[') {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return characters.isEmpty();
    }
}

import java.util.ArrayDeque;
import java.util.Deque;

public class L20_ValidParentheses {
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()) {
                if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                    return false;
                }
            }

            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
                continue;
            }

            if(s.charAt(i) == '}' && stack.pop() != '{'){
                return false;
            }

            if(s.charAt(i) == ']' && stack.pop() != '['){
                return false;
            }

            if(s.charAt(i) == ')' && stack.pop() != '('){
                return false;
            }
        }

        return stack.isEmpty();
    }
}

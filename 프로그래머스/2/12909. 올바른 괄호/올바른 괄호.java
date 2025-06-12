import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    answer = false;
                    break;
                } else if (s.charAt(i) == ')') {
                    stack.pop();
                } else {
                    answer = false;
                    break;
                }
            }
         
        }
        
        if (!stack.isEmpty()) {
            answer = false;
        }

    
        return answer;
    }
}
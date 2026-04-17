import java.io.*;
import java.util.*;

/** 
 * 
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Character> stack;
        while (true) {
            stack = new ArrayDeque<>();

            String input = br.readLine();
            if (input.equals(".")) {
                break;
            }

            for (int j = 0; j < input.length(); j++) {
                char s = input.charAt(j);

                if (s == '(') {
                    stack.push('(');
                } else if (s == '[') {
                    stack.push('[');
                } else if (s == ')') {
                    if (!stack.isEmpty() && stack.peek() == ('(')) {
                        stack.pop();
                    } else {
                        stack.push(')');
                    }
                } else if (s == ']') {
                    if (!stack.isEmpty() && stack.peek() == ('[')) {
                        stack.pop();
                    } else {
                        stack.push(']');
                    }
                }
            }

            System.out.println(stack.isEmpty() ? "yes" : "no");
        }

        
    }

}

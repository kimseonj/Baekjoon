import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String readLine;

        while (!(readLine = br.readLine()).equals(".")) {
            Deque<Character> stack = new ArrayDeque<>();
            boolean isBalanced = true;

            for (int i = 0; i < readLine.length(); i++) {
                char c = readLine.charAt(i);

                if (c == '(' || c == '[') {
                    stack.push(c);  // push로 스택 동작 명확히
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isBalanced = false;
                        break;
                    }
                    stack.pop();
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        isBalanced = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (isBalanced && stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

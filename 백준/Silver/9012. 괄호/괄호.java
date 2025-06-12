import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int n = 0; n < N; n++) {
            String readLine = br.readLine();

            Stack<Character> stack = new Stack<>();
            boolean flag = false;
            for (int i = 0; i < readLine.length(); i++) {
                char c = readLine.charAt(i);

                if (c == '(') {
                    stack.push(c);
                } else if (c == ')' && !stack.empty()) {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        flag = true;
                        break;
                    }
                } else {
                    flag = true;
                }
            }

            // 결과
            if (flag || !stack.empty()) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (input.equals("top")) {
                if (stack.isEmpty()) {
                    sb.append("-1" + "\n");
                } else {
                    sb.append(stack.peek() + "\n");
                }
            } else if (input.equals("size")) {
                sb.append(stack.size() + "\n");
            } else if (input.equals("empty")) {
                if (stack.isEmpty()) {
                    sb.append("1" + "\n");
                } else {
                    sb.append("0" + "\n");
                }
            } else if (input.equals("pop")) {
                if (stack.isEmpty()) {
                    sb.append("-1" + "\n");
                } else {
                    sb.append(stack.pop() + "\n");
                }
            } else {
                int a = Integer.parseInt(input.split(" ")[1]);
                stack.push(a);
            }
        }

        System.out.println(sb);
    }
}

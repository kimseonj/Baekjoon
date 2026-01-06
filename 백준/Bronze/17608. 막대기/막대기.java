import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> stack = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            int i = Integer.parseInt(br.readLine());

            while (!stack.isEmpty() && stack.peek() <= i) {
                stack.pop();
            }
            stack.push(i);
        }

        System.out.println(stack.size());
    }
}


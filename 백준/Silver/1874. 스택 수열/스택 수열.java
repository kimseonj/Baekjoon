import java.io.*;
import java.util.*;

/** 
 * 
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        
        boolean valid = true;
        int i = 1;
        for (int k = 0; k < N; k++) {
            int input = Integer.parseInt(br.readLine());

            while (i <= input) {
                stack.push(i++);
                sb.append("+\n");
            }

            if (stack.isEmpty() || stack.peek() != input) {
                valid = false;
                break;
            }

            stack.pop();
            sb.append("-\n");
        }

        if (valid && stack.isEmpty()) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
    }

}

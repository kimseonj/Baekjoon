import java.io.*;
import java.util.*;

/** 
 * 
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<String> stack;
        for (int i = 0; i < N; i++) {
            stack = new ArrayDeque<>();

            String[] input = br.readLine().split("");

            for (String s : input) {
                if (s.equals("(")) {
                    stack.push("(");
                } else {
                    if (!stack.isEmpty() && stack.peek().equals("(")) {
                        stack.pop();
                    } else {
                        stack.push(")");
                    }
                }
            }

            System.out.println(stack.isEmpty() ? "YES" : "NO");
        }

        
    }

}

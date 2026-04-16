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
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(br.readLine());

            if (number == 0) {
                stack.pop();
            } else {
                stack.push(number);
            }
        }

        int answer = 0;
        for (int i : stack) {
            answer += i;
        }

        System.out.println(answer);
    }

}

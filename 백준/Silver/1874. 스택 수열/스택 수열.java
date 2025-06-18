import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        Deque<Integer> stack = new ArrayDeque<>();
        int index = 0;
        int j = 1;
        while (index < N && j < N + 2) {
            if (stack.isEmpty()) {
                stack.push(j);
                sb.append("+").append("\n");
            } else if (stack.peek() == array[index]) {
                stack.pop();
                index++;
                sb.append("-").append("\n");
                continue;
            } else if (j < N+1){
                stack.push(j);
                sb.append("+").append("\n");
            }

            j++;
        }

        if (stack.isEmpty()) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
    }
}

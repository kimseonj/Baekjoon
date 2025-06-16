import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String input = br.readLine();

            if (input.equals("back")) {
                if (deque.isEmpty()) {
                    sb.append("-1" + "\n");
                } else {
                    sb.append(deque.peekFirst() + "\n");
                }
            }
            else if (input.equals("front")){
                if (deque.isEmpty()) {
                    sb.append("-1" + "\n");
                } else {
                    sb.append(deque.peekLast() + "\n");
                }
            }
            else if (input.equals("size")) {
                sb.append(deque.size() + "\n");
            } else if (input.equals("empty")) {
                if (deque.isEmpty()) {
                    sb.append("1" + "\n");
                } else {
                    sb.append("0" + "\n");
                }
            }
            else if (input.equals("pop")) {
                if (deque.isEmpty()) {
                    sb.append("-1" + "\n");
                } else {
                    sb.append(deque.pollLast() + "\n");
                }
            } else {
                int a = Integer.parseInt(input.split(" ")[1]);
                deque.push(a);
            }
        }

        System.out.println(sb);
    }
}

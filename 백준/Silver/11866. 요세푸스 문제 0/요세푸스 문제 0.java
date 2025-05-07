import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        // deque 준비
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i < N+1; i++) {
            deque.add(i);
        }


        ArrayList<Integer> answer = new ArrayList<>(N);
        while (!deque.isEmpty()) {
            for (int i = 0; i < K-1; i++) {
                int first = deque.removeFirst();
                deque.add(first);
            }
            answer.add(deque.removeFirst());
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < answer.size(); i++) {
            if (i != answer.size() - 1) {
                sb.append(answer.get(i) + ", ");
            } else {
                sb.append(answer.get(i) + ">");
            }
        }
        System.out.println(sb);

    }
}

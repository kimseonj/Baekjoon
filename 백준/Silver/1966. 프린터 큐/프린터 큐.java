import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split(" ");
            sb.append(printerQueue(Integer.parseInt(split[0]), Integer.parseInt(split[1]), br.readLine().split(" ")) + "\n");
        }

        System.out.println(sb);
    }

    private static int printerQueue(int n, int check, String[] c) {
        Deque<Integer> deque = new ArrayDeque<>();

        if (n == 1) {
            return 1;
        }

        int[] important = new int[10];
        for (int i = 0; i < n; i++) {
            deque.addLast(Integer.parseInt(c[i]));
            important[Integer.parseInt(c[i])]++;
        }

        int count = 1;
        int checkCount = check;
        loop:
        while (!deque.isEmpty()) {
            int i = deque.removeFirst();
            for (int j = i + 1; j < 10; j++) {
                if (important[j] != 0) {
                    deque.addLast(i);

                    if (checkCount == 0) {
                        checkCount = deque.size();
                    }

                    checkCount--;
                    continue loop;
                }
            }


            if (checkCount == 0) {
                return count;
            }

            checkCount--;
            important[i]--;
            count++;
        }

        return count;
    }
}

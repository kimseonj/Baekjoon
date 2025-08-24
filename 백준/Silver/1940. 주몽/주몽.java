import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 주몽
 *
 * 1 <= N <= 15,000
 * 1 <= M <= 10,000,000
 *
 * 시간 제한 2초
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        boolean[] visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = 0;

        int result = 0;
        int sum = 0;
        loop1:
        for (int i = 0; i < N - 1; i++) {
            if (visited[i]) continue;

            sum = arr[i];
            for (int j = i + 1; j < N; j++) {
                if (sum + arr[j] == M) {
                    visited[i] = true;
                    visited[j] = true;
                    result++;
                    continue loop1;
                }
            }
        }

        System.out.println(result);
    }
}


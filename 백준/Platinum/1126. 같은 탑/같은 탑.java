import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] arr;
    static int[][] dp;
    static final int INF = -1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }

        dp = new int[N + 1][sum + 1];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], INF);
        }

        dp[0][0] = 0;

        for (int i = 0; i < N; i++) {
            int h = arr[i];
            for (int d = 0; d <= sum; d++) {
                if (dp[i][d] == INF) continue;

                // 1. 사용 안 함
                dp[i + 1][d] = Math.max(dp[i + 1][d], dp[i][d]);

                // 2. 높은 쪽
                if (d + h <= sum) {
                    dp[i + 1][d + h] = Math.max(dp[i + 1][d + h], dp[i][d]);
                }

                // 3. 낮은 쪽
                int newD = Math.abs(d - h);
                dp[i + 1][newD] = Math.max(
                    dp[i + 1][newD],
                    dp[i][d] + Math.min(d, h)
                );
            }
        }

        int ans = dp[N][0];
        System.out.println(ans == 0 ? -1 : ans);
    }
}
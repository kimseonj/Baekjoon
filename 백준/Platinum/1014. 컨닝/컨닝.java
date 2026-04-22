import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] broken;
    static List<Integer> validMasks;

    static int countBits(int x) {
        return Integer.bitCount(x);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            broken = new int[N];

            for (int i = 0; i < N; i++) {
                String row = br.readLine();
                int mask = 0;
                for (int j = 0; j < M; j++) {
                    if (row.charAt(j) == 'x') {
                        mask |= (1 << j);
                    }
                }
                broken[i] = mask;
            }

            // 유효한 mask 미리 생성
            validMasks = new ArrayList<>();
            for (int mask = 0; mask < (1 << M); mask++) {
                if ((mask & (mask << 1)) == 0) {
                    validMasks.add(mask);
                }
            }

            // DP
            Map<Integer, Integer>[] dp = new HashMap[N];
            for (int i = 0; i < N; i++) {
                dp[i] = new HashMap<>();
            }

            // 첫 행
            for (int mask : validMasks) {
                if ((mask & broken[0]) == 0) {
                    dp[0].put(mask, countBits(mask));
                }
            }

            // 나머지 행
            for (int i = 1; i < N; i++) {
                for (int cur : validMasks) {
                    if ((cur & broken[i]) != 0) continue;

                    for (int prev : dp[i - 1].keySet()) {
                        if ((cur & (prev << 1)) == 0 &&
                            (cur & (prev >> 1)) == 0) {

                            int val = dp[i - 1].get(prev) + countBits(cur);
                            dp[i].put(cur, Math.max(dp[i].getOrDefault(cur, 0), val));
                        }
                    }
                }
            }

            int ans = 0;
            for (int val : dp[N - 1].values()) {
                ans = Math.max(ans, val);
            }

            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }
}
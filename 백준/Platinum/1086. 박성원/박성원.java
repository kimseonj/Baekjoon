import java.io.*;
import java.util.*;

public class Main {
    static int N, K;
    static String[] arr;
    static int[] mod, len;
    static int[] pow10;
    static long[][] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        K = Integer.parseInt(br.readLine());

        mod = new int[N];
        len = new int[N];

        // 각 숫자 mod K
        for (int i = 0; i < N; i++) {
            int m = 0;
            for (char c : arr[i].toCharArray()) {
                m = (m * 10 + (c - '0')) % K;
            }
            mod[i] = m;
            len[i] = arr[i].length();
        }

        // pow10
        pow10 = new int[51];
        pow10[0] = 1 % K;
        for (int i = 1; i <= 50; i++) {
            pow10[i] = (pow10[i - 1] * 10) % K;
        }

        dp = new long[1 << N][K];
        dp[0][0] = 1;

        for (int mask = 0; mask < (1 << N); mask++) {
            for (int r = 0; r < K; r++) {
                if (dp[mask][r] == 0) continue;

                for (int i = 0; i < N; i++) {
                    if ((mask & (1 << i)) != 0) continue;

                    int nextMask = mask | (1 << i);
                    int nextR = (r * pow10[len[i]] + mod[i]) % K;

                    dp[nextMask][nextR] += dp[mask][r];
                }
            }
        }

        long numerator = dp[(1 << N) - 1][0];

        long denominator = 1;
        for (int i = 2; i <= N; i++) denominator *= i;

        long g = gcd(numerator, denominator);

        System.out.println((numerator / g) + "/" + (denominator / g));
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        long[] count = new long[10];

        long digit = 1;

        while (digit <= N) {
            long high = N / (digit * 10);
            long cur = (N / digit) % 10;
            long low = N % digit;

            // 기본
            for (int i = 0; i < 10; i++) {
                count[i] += high * digit;
            }

            // 현재 자리 반영
            for (int i = 0; i < cur; i++) {
                count[i] += digit;
            }

            count[(int)cur] += low + 1;

            // 0 보정
            count[0] -= digit;

            digit *= 10;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(count[i]).append(" ");
        }

        System.out.println(sb);
    }
}
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 숫자의 합
 *
 * N (1 ≤ N ≤ 100)
 * 시간 제한 1초
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String readLine = br.readLine();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += readLine.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}


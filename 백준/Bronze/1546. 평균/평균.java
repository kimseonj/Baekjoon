import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 평균
 *
 * 시간제한 2초
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        double max = 0;
        double sum = 0;
        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(st.nextToken());
            if (score > max) max = score;
            sum += score;
        }

        System.out.println(sum/max*100.0/N);
    }
}


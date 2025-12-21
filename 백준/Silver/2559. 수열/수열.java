import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    /*
    * 10 2
    * 3 -2 -4 -9 0 3 7 13 8 -3
    *
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] prefix = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            prefix[i] = prefix[i - 1] + Integer.parseInt(st.nextToken());
        }

        // 문제
        int result = Integer.MIN_VALUE;
        for (int i = 1; i + K - 1 <= N; i++) {
            int cur = prefix[i+K-1] - prefix[i-1];
            result = Math.max(cur, result);
        }
        
        System.out.println(result);
    }
}


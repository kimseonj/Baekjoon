import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 수들의 합 5
 * 
 * 시간 제한 2초
 * 
 * n <= 10,000,000
 */
public class Main {

    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        int start = 1;
        int end = 1;

        int result = 1;
        int sum = 0;
        while (start < N) {
            if (sum == N) {
                result++;
                sum -= arr[start++];
            } else if (sum < N) {
                sum += arr[end++];
            } else {
                sum -= arr[start++];
            }
        }

        System.out.println(result);

    }
}


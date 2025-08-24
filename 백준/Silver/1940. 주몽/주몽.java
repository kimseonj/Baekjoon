import java.io.*;
import java.util.*;

/**
 * 주몽
 *
 * 1 <= N <= 15,000
 * 1 <= M <= 10,000,000
 *
 * 시간 제한 2초
 *
 * 정렬 + 투포인터 사용해보기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int start = 0;
        int end = N - 1;

        int sum = 0;
        int result = 0;
        while (start < end) {
            sum = arr[start] + arr[end];
            if (sum == M) {
                result++;
                start++;
                end--;
            } else if (sum > M) {
                end--;
            } else {
                start++;
            }
        }

        System.out.println(result);
    }
}


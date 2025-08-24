import java.io.*;
import java.util.*;

/**
 * 좋다
 *
 * 투포인터
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int result = 0;
        for (int i = 0; i < N; i++) {
            int start = 0;
            int end = N - 1;

            while (start < end) {
                if (start == i) {
                    start++;
                    continue;
                } else if (end == i) {
                    end--;
                    continue;
                }

                if (arr[i] == arr[start] + arr[end]) {
                    result++;
                    break;
                } else if (arr[i] > arr[start] + arr[end]) {
                    start++;
                } else {
                    end--;
                }
            }

        }

        System.out.println(result);
    }
}


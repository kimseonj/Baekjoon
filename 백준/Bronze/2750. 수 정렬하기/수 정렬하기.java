import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 수 정렬하기
 *
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *
 * N(1 ≤ N ≤ 1,000)
 * 절댓값이 1,000보다 작거나 같은 정수
 *
 * 배열사용?
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(input);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(input[i]).append("\n");
        }

        System.out.println(sb);
    }
}


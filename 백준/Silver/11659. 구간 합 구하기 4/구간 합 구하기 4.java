import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 구간 합 구하기 4
 *
 * 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
 * 시간제한 1초
 *
 * O(N^2)까지 나옴 -> 구간합 사용
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 수의 개수 N, 횟수 M
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 입력
        int[] prefixSum = new int[N];

        st = new StringTokenizer(br.readLine());
        int temp = 0;
        for (int i = 0; i < N; i++) {
            temp += Integer.parseInt(st.nextToken());
            prefixSum[i] = temp;
        }

        // 문제
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            logic(prefixSum, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
    }

    static void logic(int[] prefixSum, int start, int end) {
        if (start == 1) {
            System.out.println(prefixSum[end - 1]);
        } else {
            System.out.println(prefixSum[end - 1] - prefixSum[start - 2]);
        }
    }
}


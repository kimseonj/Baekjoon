import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 수의 개수 N, 횟수 M
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 입력

        int[][] table = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                table[i][j] = Integer.parseInt(st.nextToken());
            }
        }

//        for (int[] ints : table) {
//            System.out.println(Arrays.toString(ints));
//        }

        int[][] prefixSum = new int[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                prefixSum[i][j] = prefixSum[i][j - 1] + table[i-1][j-1];
            }
        }

//        for (int[] ints : prefixSum) {
//            System.out.println(Arrays.toString(ints));
//        }


//         누적 합 계산
//        st = new StringTokenizer(br.readLine());
//        for (int i = 1; i <= N; i++) {
//            prefixSum[i] = prefixSum[i-1] + Integer.parseInt(st.nextToken());
//        }

        // 문제 해결
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = 0;
            for (int j = x1; j <= x2; j++) {

                result += prefixSum[j][y2] - prefixSum[j][y1-1];
            }

            System.out.println(result);
        }
    }
}


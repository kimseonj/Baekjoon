import java.io.*;
import java.util.*;

/** 
 * 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬
 * 1초
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arrays = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrays[i][0] = Integer.parseInt(st.nextToken());
            arrays[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arrays, (a, b) -> {
            if (a[1] == b[1]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        StringBuilder sb = new StringBuilder();
        for (int[] arr : arrays) {
            sb.append(arr[0]).append(" ")
                .append(arr[1]).append("\n");
        }
        System.out.println(sb);
    }
}

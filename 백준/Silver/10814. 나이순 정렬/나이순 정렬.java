import java.io.*;
import java.util.*;

/** 
 * 나이와 이름이 가입한 순서대로 주어진다.
 * 
 * 회원들을 나이가 증가하는 순 정렬
 * 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬
 * 
 * 3초, N < 100,000명
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[][] arr = new String[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr, (a, b) -> {
            return Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0]));
        });

        StringBuilder sb = new StringBuilder();
        for (String[] words : arr) {
            sb.append(words[0]).append(" ")
                .append(words[1]).append("\n");
        }
        System.out.println(sb);
    }
}

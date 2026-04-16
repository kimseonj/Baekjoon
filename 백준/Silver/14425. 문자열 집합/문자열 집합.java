import java.io.*;
import java.util.*;

/** 
 * N개의 문자열로 이루어진 집합 S
 * 입력: M개의 문자열
 * 집합 S에 포함되어 있는 것이 총 몇 개
 * 
 * 2초
 * N과 M (1 ≤ N ≤ 10,000, 1 ≤ M ≤ 10,000)
 * 
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), null);
        }

        int result = 0;
        for (int i = 0; i < M; i++) {
            if (map.containsKey(br.readLine())) result++;
        }

        System.out.println(result);
    }
}

import java.io.*;
import java.util.*;

/** 
 * M개의 줄에 각각의 문제에 대한 답
 * 입력으로 숫자가 들어왔다면 그 숫자에 해당하는 포켓몬의 이름을,
 * 문자가 들어왔으면 그 포켓몬의 이름에 해당하는 번호를 출력
 * 집합 S에 포함되어 있는 것이 총 몇 개
 * 
 * 2초
 * N과 M (1 ≤ N, M ≤ 500,000)
 * 
 * 이중For문 돌면 시간초과 발생함 250,000,000,000번
 * 
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        int k = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String question = br.readLine();
            if (set.contains(question)) {
                list.add(question);
            }
        }

        StringBuilder sb = new StringBuilder();
        Collections.sort(list);
        for (String a : list) {
            sb.append(a).append("\n");
        }

        System.out.println(list.size());
        System.out.println(sb);
    }

}

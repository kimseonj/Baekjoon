import java.io.*;
import java.util.*;

/** 
 * M개의 줄에 각각의 문제에 대한 답
 * 입력으로 숫자가 들어왔다면 그 숫자에 해당하는 포켓몬의 이름을,
 * 문자가 들어왔으면 그 포켓몬의 이름에 해당하는 번호를 출력
 * 집합 S에 포함되어 있는 것이 총 몇 개
 * 
 * 2초
 * N과 M (1 ≤ N, M ≤ 100,000)
 * 
 * 이중For문 돌면 시간초과 발생함
 * 
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> input = new HashMap<>();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            String pokemon = br.readLine();
            input.put(pokemon, i);
            arr[i] = pokemon;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String question = br.readLine();
            if (question.chars().allMatch(Character::isDigit)) {
                sb.append(arr[Integer.parseInt(question) - 1]).append("\n");
            } else {
                sb.append(input.get(question) + 1).append("\n");
            }
        }

        System.out.println(sb);
    }

}

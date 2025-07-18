import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static boolean[] visited;
    static LinkedList<Integer>[] list;
    static boolean found = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 초기화
        visited = new boolean[N];
        list = new LinkedList[N];
        for (int i = 0; i < N; i++) {
            list[i] = new LinkedList<>();
        }

        // 노드 연결
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list[x].add(y);
            list[y].add(x); // 양방향
        }

        for (int i = 0; i < N; i++) {
            dfs(i, 1);
            if (found) break;
        }

        if (found) System.out.println(1);
        else System.out.println(0);
    }


    static void dfs(int i, int depth) {
        if (depth > 4) {
            found = true;
            return;
        }
        visited[i] = true;

        LinkedList<Integer> integers = list[i];

        for (Integer integer : integers) {
            if (!visited[integer]) {
                dfs(integer, depth + 1);
            }
        }

        visited[i] = false;
    }

}
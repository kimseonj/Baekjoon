import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        int[][] log = new int[N][2];
        int max = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            max = Math.max(max, x2);

            log[i][0] = x1;
            log[i][1] = x2;
        }

        // 분리집합 초기화
        parent = new int[max + 1];
        for (int i = 0; i < max + 1; i++) {
            parent[i] = i;
        }

        for (int[] ints : log) {
            int root = 0;

            if (find(ints[0]) == ints[0]) {
                root = ints[0];
            } else {
                root = find(ints[0]);
            }

            for (int i = ints[0] + 1; i <= ints[1]; i++) {
                union(root, i);
            }
        }

        // 문제
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int y1 = Integer.parseInt(st.nextToken()) - 1;
            int y2 = Integer.parseInt(st.nextToken()) - 1;

            if (find(log[y1][0]) == find(log[y2][0])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

    }

    static int find(int c) {
        if (parent[c] == c) {
            return c;
        }
        return parent[c] = find(parent[c]);
    }

    static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);

        if (rootA != rootB) {
            parent[Math.max(rootA, rootB)] = Math.min(rootA, rootB);
        }
    }
}


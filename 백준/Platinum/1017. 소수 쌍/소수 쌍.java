import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] arr;
    static boolean[] isPrime;
    static List<Integer>[] graph;
    static int[] match;
    static boolean[] visited;

    static boolean dfs(int x) {
        for (int y : graph[x]) {
            if (visited[y]) continue;
            visited[y] = true;

            if (match[y] == -1 || dfs(match[y])) {
                match[y] = x;
                return true;
            }
        }
        return false;
    }

    static void sieve(int max) {
        isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        sieve(2000);

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int x : arr) {
            if (x % 2 == 0) even.add(x);
            else odd.add(x);
        }

        // 짝수/홀수 개수 다르면 불가능
        if (even.size() != odd.size()) {
            System.out.println(-1);
            return;
        }

        // 기준: arr[0]이 속한 쪽을 left로
        boolean firstEven = arr[0] % 2 == 0;

        List<Integer> left = firstEven ? even : odd;
        List<Integer> right = firstEven ? odd : even;

        List<Integer> answer = new ArrayList<>();

        for (int target : right) {
            if (!isPrime[arr[0] + target]) continue;

            // 그래프 생성
            graph = new ArrayList[left.size()];
            for (int i = 0; i < left.size(); i++) {
                graph[i] = new ArrayList<>();
                for (int j = 0; j < right.size(); j++) {
                    if (right.get(j) == target) continue;
                    if (left.get(i) == arr[0]) continue;

                    if (isPrime[left.get(i) + right.get(j)]) {
                        graph[i].add(j);
                    }
                }
            }

            match = new int[right.size()];
            Arrays.fill(match, -1);

            int cnt = 0;

            for (int i = 0; i < left.size(); i++) {
                if (left.get(i) == arr[0]) continue;
                visited = new boolean[right.size()];
                if (dfs(i)) cnt++;
            }

            if (cnt == left.size() - 1) {
                answer.add(target);
            }
        }

        if (answer.isEmpty()) {
            System.out.println(-1);
        } else {
            Collections.sort(answer);
            for (int x : answer) {
                System.out.print(x + " ");
            }
        }
    }
}
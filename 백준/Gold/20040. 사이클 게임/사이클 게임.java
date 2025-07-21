import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        int output = 0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());;

            if (find(a) != find(b)) {
                union(a, b);
            } else if (find(a) == find(b)) {
                output = i+1;
                break;
            }
        }

        System.out.println(output);
    }

    static int[] arr;

    static int find(int n) {
        if (arr[n] == n) {
            return n;
        }
        return arr[n] = find(arr[n]);
    }

    static void union(int p, int n) {
        int rootP = find(p);
        int rootN = find(n);

        if (rootP != rootN) {
            arr[rootN] = rootP;
        }
    }
}
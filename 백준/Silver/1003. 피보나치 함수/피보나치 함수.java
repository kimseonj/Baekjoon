import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    static HashMap<Integer, int[]> map = new HashMap<>();

    static void fibonacci(int n) {
        int[] f1 = map.get(n - 1);
        int[] f2 = map.get(n - 2);

        int[] fibo = {f1[0] + f2[0], f1[1] + f2[1]};

        map.put(n, fibo);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        map.put(0, new int[]{1, 0});
        map.put(1, new int[]{0, 1});

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            arr[i] = input;
            max = Math.max(max, input);
        }

        for (int i = 2; i <= max; i++) {
            fibonacci(i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int[] fibonacci = map.get(arr[i]);
            sb.append(fibonacci[0] + " " + fibonacci[1]);
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
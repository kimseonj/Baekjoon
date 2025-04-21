import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i + "\n");
        }

        System.out.println(sb);
    }
}
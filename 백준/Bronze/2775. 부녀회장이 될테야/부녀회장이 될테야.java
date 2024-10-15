import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int[] get(int k, int n) {
        int[] result = new int[n];
        if (k==0) {
            int[] zero = new int[n];
            for (int i=1; i<=n; i++) {
                zero[i-1] = i;
            }
            return zero;
        } else {
            int prev[] = get(k-1, n);
            for (int i=k; i>=0; i--) {
                int sum=0;
                for (int j=0; j<n; j++) {
                    sum += prev[j];
                    result[j] = sum;
                }
            }
            return result;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());

            int[] result = get(a-1, b);

            int sum=0;
            for (int num : result) {
                sum+=num;
            }

//            System.out.println(Arrays.toString(result));
//            System.out.println(sum);
            sb.append(sum + "\n");
        }

        System.out.println(sb);
    }
}
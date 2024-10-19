import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[10000];
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n-1]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<arr.length; i++) {
            if(arr[i]==0) {
                continue;
            }
            for (int j=0; j<arr[i]; j++) {
                sb.append((i+1) + "\n");
            }
        }
        System.out.println(sb);

    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        
        int N = Integer.parseInt(arr[0]);
        int K = Integer.parseInt(arr[1]);

        int[] score = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(score);
        System.out.println(score[score.length - K]);
    }
}

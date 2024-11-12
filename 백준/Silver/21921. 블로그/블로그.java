import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int x = Integer.parseInt(arr[1]);

        String[] visitArr = bufferedReader.readLine().split(" ");
        int[] visit = new int[n];
        for (int i=0; i<n; i++) {
            visit[i] = Integer.parseInt(visitArr[i]);
        }

        if (Arrays.stream(visit).sum() == 0) {
            System.out.println("SAD");
        } else {
            int max = 0;
            int cnt = 1;
            int sum = 0;
            // 시작점
            for (int i=0; i<x; i++) {
                sum+=visit[i];
            }
            max = sum;

            for (int i=1; i<(n-x+1); i++) {
                // loop
                sum = (sum - visit[i-1] + visit[i+x-1]);

//                System.out.println("loogp" + i + ":" + sum);
                if (sum>max) {
                    max = sum;
                    cnt = 1;
                } else if (sum == max) {
                    cnt++;
                }
            }

            System.out.println(max);
            System.out.println(cnt);
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void makeSnail(int n, int answer) {
        int[][] arr = new int[n][n];
        int max = (int) Math.pow(n, 2);

        int start = 0;
        int end = n-1;

//        while(true) {
        for (int x=0; x<(n/2)+1; x++) {
            for (int i=start; i<=end; i++) {
                arr[i][start] = max--;
                if (max == 1) break;
            }
            for (int i=start; i<end; i++) {
                arr[end][i+1] = max--;
            }

            for (int i=end; i>start; i--) {
                arr[i-1][end] = max--;
            }
            for (int i=end; i>start+1; i--) {
                arr[start][i-1] = max--;
            }

            start++;
            end--;

        }
        int x=0;
        int y=0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (arr[i][j] == answer) {
                    x = i;
                    y = j;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.printf("%d %d", x+1, y+1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int answer = Integer.parseInt(bufferedReader.readLine());

        makeSnail(n, answer);

    }
}
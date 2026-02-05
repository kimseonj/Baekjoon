import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] pows = new int[200];

        for (int i = 0; i < pows.length; i++) {
            pows[i] = (int) Math.pow(i, 2);
        }

        String readLine = br.readLine();

        int answer = -1;
        int year = Integer.parseInt(readLine);

        for (int i = year + 1; i <= 9999; i++) {
            int a = i / 100;
            int b = i % 100;

            if (pows[a + b] == i) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}

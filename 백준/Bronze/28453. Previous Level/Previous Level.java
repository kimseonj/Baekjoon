import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            bw.write(getLevel(Integer.parseInt(st.nextToken())) + " ");
        }

        bw.flush();
    }

    static int getLevel(int level) {
        if (level < 250) {
            return 4;
        }
        if (level < 275) {
            return 3;
        }
        if (level < 300) {
            return 2;
        }
        if (level == 300) {
            return 1;
        }
        return 0;
    }
}
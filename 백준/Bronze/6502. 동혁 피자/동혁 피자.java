import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 1;
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            double r = Integer.parseInt(st.nextToken());
            if (r == 0) break;
            double w = Integer.parseInt(st.nextToken());
            double l = Integer.parseInt(st.nextToken());

            System.out.printf("Pizza %d", i++);

            double tri = Math.pow((w/2), 2) + Math.pow((l/2), 2);
            double r2 = Math.pow(r, 2);
            if (tri <= r2) {
                System.out.println(" fits on the table.");
            } else {
                System.out.println(" does not fit on the table.");
            }
        }
    }
}


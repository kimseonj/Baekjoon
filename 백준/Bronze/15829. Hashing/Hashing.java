import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int r = 31;
        int M = 1234567891;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int n = 0;
        int result = 0;
        for (int i=0; i<L; i++) {
            n = s.charAt(i) - 96;
            result += (n*Math.pow(r, i));
        }

        if (result > M) {
            System.out.println(result/M);
        } else {
            System.out.println(result);
        }
    }
}
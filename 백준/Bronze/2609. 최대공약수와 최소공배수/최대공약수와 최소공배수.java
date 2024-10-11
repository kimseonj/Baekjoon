import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int Euclidean(int a, int b) {
        if (b==0)
            return a;
        return Euclidean(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcd;
        if (a>=b) {
            gcd = Euclidean(a, b);
        } else {
            gcd = Euclidean(b, a);
        }

        System.out.println(gcd);
        System.out.println(a*b/gcd);
    }
}
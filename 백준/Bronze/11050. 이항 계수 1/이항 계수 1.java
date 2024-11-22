import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        int numerator = 1;
        for (int i = 0; i<b; i++) {
            numerator *= (a-i);
        }

        int denominator = 1;
        for (int i = 1; i<=b; i++) {
            denominator *= i;
        }

        System.out.println(numerator/denominator);
    }
}

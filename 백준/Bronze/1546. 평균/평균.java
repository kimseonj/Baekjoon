import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        double sum=0;
        int max=0;
        for (String s : arr) {
            int i = Integer.parseInt(s);
            sum += i;
            if (i>max) {
                max = i;
            }
        }

        System.out.print(sum/max*100/n);

    }
}
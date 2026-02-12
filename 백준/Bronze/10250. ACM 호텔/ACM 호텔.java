import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int j = Integer.parseInt(bf.readLine());
        int[] result = new int[j];

        for (int i = 0; i < j; i++) {
            String[] a = bf.readLine().split(" ");
            int h = Integer.parseInt(a[0]);
            int w = Integer.parseInt(a[1]);
            int n = Integer.parseInt(a[2]);

            int XX = (n/h) + 1;
            int YY = (n%h);
            if(XX == 0) {
                XX = 1;
                YY = n;
            }
            if(YY == 0) {
                YY = h;
                XX = XX-1;
            }
                

            result[i] = YY*100 + XX;
        }

        for (int i : result) {
            System.out.println(i);
        }

    }
    
}

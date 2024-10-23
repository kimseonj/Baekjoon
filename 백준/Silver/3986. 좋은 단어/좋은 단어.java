import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            String input = br.readLine();

            if(input.length()%2 == 1) {
                continue;
            }

            int idx = 0;
            String[] arr = input.split("");
            String[] check = new String[arr.length];
            for (String s : arr) {
                if (idx > (arr.length/2)) {
                    break;
                }

                if (idx == 0) {
                    check[idx] = s;
                    idx++;
                } else {
                    if (check[idx-1].equals(s)) {
                        check[idx-1] = null;
                        idx--;
                    } else {
                        check[idx] = s;
                        idx++;
                    }
                }

            }

            if (check[0] == null) {
                result++;
            }
//
        }

        System.out.println(result);
    }
}
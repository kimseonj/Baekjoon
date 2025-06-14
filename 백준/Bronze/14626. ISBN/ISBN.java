import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String readLine = br.readLine();
        int result = 0;

        // 배열준비
        int n = 0;
        int sum = 0;
        int m = 0;
        for (int i = 1; i <= readLine.length(); i++) {
            char c = readLine.charAt(i-1);

            if (c == '*') {
                n = i;
            } else {
                if (i % 2 == 0) {
                    sum += 3 * Character.getNumericValue(c);
                } else {
                    sum += Character.getNumericValue(c);
                }
            }
        }

        // 풀이
        if (n == readLine.length()) {
            result = 10 - (sum % 10);
        } else {
            for (int i = 0; i < 10; i++) {
                int temp = sum;
                if (n % 2 == 0) {
                    temp = sum + 3 * i;
                } else {
                    temp = sum + i;
                }

                if (temp % 10 == 0) {
                    result = i;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}



/*
* 9788968322273
* 9*88968322273
* */
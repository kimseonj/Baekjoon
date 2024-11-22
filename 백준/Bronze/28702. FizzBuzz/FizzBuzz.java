import java.io.*;

public class Main {
    public static String fizzbuzz(int n) {
        if ((n % 15) == 0) {
            return "FizzBuzz";
        } else if ((n % 3) == 0) {
            return "Fizz";
        } else if ((n % 5) == 0) {
            return "Buzz";
        } else {
            return n + "";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 1;
        try {
            n = Integer.parseInt(br.readLine());
            n += 3;
        } catch (NumberFormatException e) {
            try {
                n = Integer.parseInt(br.readLine());
                n += 2;
            } catch (NumberFormatException e1) {
                try {
                    n = Integer.parseInt(br.readLine());
                    n += 1;
                } catch (NumberFormatException e3) { }
            }
        }
        System.out.println(fizzbuzz(n));
    }
}

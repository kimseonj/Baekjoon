import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String s = "";
        while(!(s = br.readLine()).equals("0")) {
            int out = 0;
            for (int i=0; i<s.length()/2; i++) {
                if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                    out++;
                    break;
                }
            }
            if (out>0) {
                sb.append("no\n");
            } else {
                sb.append("yes\n");
            }
        }

        System.out.println(sb);
    }
}
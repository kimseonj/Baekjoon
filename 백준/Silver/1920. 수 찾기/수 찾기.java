import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String[] A = br.readLine().split(" ");
        HashSet<String> set = new HashSet<>();

        for (String a : A) {
            set.add(a);
        }

        int M = Integer.parseInt(br.readLine());
        String[] B = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for (String b : B) {
            if (set.contains(b)) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }

        System.out.println(sb);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] A = br.readLine().split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String a : A) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        String[] B = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for (String b : B) {
            if (map.containsKey(b)) {
                sb.append(map.get(b)).append(" ");
            } else {
                sb.append("0").append(" ");
            }
        }

        System.out.println(sb);
    }
}

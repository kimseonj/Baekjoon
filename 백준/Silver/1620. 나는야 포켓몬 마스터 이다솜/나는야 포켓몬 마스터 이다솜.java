import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        HashMap<String, Integer> map = new HashMap<>();
        String[] pokemon = new String[N + 1];
        for (int i = 1; i <= N; i++) {
            String a = br.readLine();;
            pokemon[i] = a;
            map.put(a, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            try {
                sb.append(pokemon[Integer.parseInt(input)]);
                sb.append("\n");
            } catch (NumberFormatException e) {
                sb.append(map.get(input));
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}
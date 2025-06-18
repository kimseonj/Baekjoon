import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            getSet(br.readLine());
        }

        System.out.println(sb);
    }

    public static void getSet(String input) {
        if (input.startsWith("add")) {
            int number = Integer.parseInt(input.split(" ")[1]);
            set.add(number);
        } else if (input.startsWith("remove")) {
            int number = Integer.parseInt(input.split(" ")[1]);
            set.remove(number);
        } else if (input.startsWith("check")) {
            if (set.contains(Integer.parseInt(input.split(" ")[1]))) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        } else if (input.startsWith("toggle")) {
            int number = Integer.parseInt(input.split(" ")[1]);
            if (set.contains(number)) {
                set.remove(number);
            } else {
                set.add(number);
            }
        } else if (input.startsWith("empty")) {
            set = new HashSet<>();
        } else if (input.startsWith("all")) {
            set = new HashSet<>();

            for (int i = 1; i <= 20; i++) {
                set.add(i);
            }
        }
    }
}
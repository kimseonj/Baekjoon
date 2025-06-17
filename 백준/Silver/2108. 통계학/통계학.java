import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        StringBuilder sb = new StringBuilder();
        sb.append(mean(array)).append("\n");
        sb.append(median(array)).append("\n");
        sb.append(mode(array)).append("\n");
        sb.append(range(array));

        System.out.println(sb);
    }

    private static int mean(int[] array) {
        return (int) Math.round(Arrays.stream(array).average().getAsDouble());
    }

    private static int median(int[] array) {
        Arrays.sort(array);

        return array[array.length/2];
    }

    private static int mode(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i : map.keySet()) {
            int count = map.get(i);

            if (map.get(i) == max) {
                list.add(i);
            } else if (map.get(i) > max) {
                list.clear();
                list.add(i);
                max = map.get(i);
            }
        }

        Collections.sort(list);
        if (list.size() == 1) {
            return list.get(0);
        } else {
            return list.get(1);
        }
    }

    private static int range(int[] array) {
        Arrays.sort(array);

        return array[array.length - 1] - array[0];
    }


}

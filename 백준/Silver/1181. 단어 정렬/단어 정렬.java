import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // index, length
        Map<Integer, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            map.put(s.length(), null);
            set.add(s);
        }

        Set<Integer> keySet = map.keySet();
        Object[] array = keySet.toArray();
//        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));

        Object[] arr = set.toArray();
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        for (Object j : array) {
            for (int i = 0; i < arr.length; i++) {
                if (((String)arr[i]).length() == (Integer)j) {
                    sb.append((String) arr[i] + "\n");
                }
            }
        }

        System.out.println(sb);

    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashMap<String, Boolean> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
//            System.out.println(arr[0]);
//            System.out.println(arr[1].equals("enter") ? true : false);
            map.put(arr[0], arr[1].equals("enter") ? true : false);
        }

        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet,Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String key : keySet) {
            if(map.get(key) == true) {
                sb.append(key+"\n");
            }
        }

        System.out.println(sb);

    }
}
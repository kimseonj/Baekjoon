import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        int answer = N == 1 ? 0 : function(arr, N);

        bw.write(answer + "\n");
        bw.flush();
    }

    static int function(ArrayList<Integer> arr, int N) throws IOException {
        int dasom = Integer.parseInt(br.readLine());
        for (int i = 0; i < N-1; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        int count = 0;
        while (dasom <= Collections.max(arr)) {
            Collections.sort(arr, Collections.reverseOrder());
            dasom += 1;
            arr.set(0, arr.get(0) - 1);
            count++;
        }

        return count;
    }
}
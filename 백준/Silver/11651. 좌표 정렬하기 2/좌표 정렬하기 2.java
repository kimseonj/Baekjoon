import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] planes = new int[N][2];
        for (int[] plane : planes) {
            String[] split = br.readLine().split(" ");

            plane[0] = Integer.parseInt(split[0]);
            plane[1] = Integer.parseInt(split[1]);
        }

        Arrays.sort(planes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int[] plane : planes) {
            sb.append(plane[0] + " " + plane[1] + "\n");
        }

        System.out.println(sb);

    }

}

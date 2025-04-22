/*
* 객체 -> 배열
* 메모리 체크
* StringBuilder 사용
* */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        int[][] planes = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] s = bufferedReader.readLine().split(" ");
            planes[i][0] = Integer.parseInt(s[0]);
            planes[i][1] = Integer.parseInt(s[1]);
        }

        Arrays.sort(planes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int[] plane : planes) {
            sb.append(plane[0] + " " + plane[1] + "\n");
        }

        System.out.println(sb);

    }
}

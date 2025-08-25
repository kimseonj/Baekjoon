import java.io.*;
import java.util.*;

/**
 * 최솟값 찾기
 * <p>
 * 시간제한 2.6초(자바11)
 * 
 * start와 end를 이용하는 슬라이딩윈도우 방식 <- 시간초과
 * Deque를 슬라이딩윈도우 방식처럼 사용
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Deque<int[]> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            while (!deque.isEmpty() && deque.getLast()[1] > arr[i]) {
                deque.removeLast();
                if (deque.isEmpty()) {
                    break;
                }
            }

            deque.addLast(new int[]{i, arr[i]});

            if (deque.getFirst()[0] <= (i - L)) {
                deque.removeFirst();
            }

            sb.append(deque.getFirst()[1]).append(' ');
        }

        System.out.println(sb);
    }
}


import java.io.*;
import java.util.*;

/** 
 * 자연수를 원소로 갖는 공집합이 아닌 두 집합 A와 B
 * 두 집합의 대칭 차집합의 원소의 개수를 출력
 * 
 * (A-B)와 (B-A)의 합집합을 A와 B의 대칭 차집합
 * 
 * 2초
 * 
 * 0 < A원소, B원소 <= 200,000
 * 
 * 
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<Integer> A = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> B = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int number = Integer.parseInt(st.nextToken());

            if (A.contains(number)) {
                A.remove(number);
            } else {
                B.add(number);
            }
        }

        System.out.println(A.size() + B.size());
    }

}

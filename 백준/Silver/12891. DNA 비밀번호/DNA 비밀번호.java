import java.io.*;
import java.util.*;

/**
 * DNA 비밀번호
 *
 * 시간제한 2초
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String input = br.readLine();

        HashMap<Character, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        map.put('A', Integer.parseInt(st.nextToken()));
        map.put('C', Integer.parseInt(st.nextToken()));
        map.put('G', Integer.parseInt(st.nextToken()));
        map.put('T', Integer.parseInt(st.nextToken()));

        int result = 0;
        // 초기 세팅
        for (int i = 0; i < M; i++) {
            map.replace(input.charAt(i), map.get(input.charAt(i)) - 1);
        }


        int check = 0;
        for (Character c : map.keySet()) {
            if (map.get(c) <= 0) {
                check++;
            }
            if (check == 4) result++;
        }

        // 로직
        int start = 0;
        int end = M;
        while (end < N) {
            map.replace(input.charAt(start), map.get(input.charAt(start)) + 1);
            map.replace(input.charAt(end), map.get(input.charAt(end)) - 1);

            check = 0;
            for (Character c : map.keySet()) {
                if (map.get(c) <= 0) {
                    check++;
                }
                if (check == 4) result++;
            }

            start++;
            end++;
        }

        System.out.println(result);

    }
}


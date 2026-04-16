import java.io.*;
import java.util.*;

/** 
 * 첫째 줄에 로그에 기록된 출입 기록의 수 n
 * "enter"인 경우는 출근, "leave"인 경우는 퇴근
 * 동명이인이 없으며, 대소문자가 다른 경우에는 다른 이름
 * 사람들의 이름은 알파벳 대소문자로 구성된 5글자 이하의 문자열
 * 
 * 1초
 * 
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String check = st.nextToken();

            if (check.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
            
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
            
        StringBuilder sb = new StringBuilder();
        for (String a : list) {
            sb.append(a).append("\n");
        }

        System.out.println(sb);
    }

}

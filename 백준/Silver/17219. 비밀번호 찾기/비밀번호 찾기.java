import java.io.*;
import java.util.*;

/** 
 * 첫째 줄에 저장된 사이트 주소의 수 N(1 ≤ N ≤ 100,000)
 * 비밀번호를 찾으려는 사이트 주소의 수 M(1 ≤ M ≤ 100,000)
 * 
 * 동명이인이 없으며, 대소문자가 다른 경우에는 다른 이름
 * 사람들의 이름은 알파벳 대소문자로 구성된 5글자 이하의 문자열
 * 
 * 5초
 * 
 * O(N*M) 10,000,000,000 
 * 
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            list.add(map.get(br.readLine()));
        }
    
        StringBuilder sb = new StringBuilder();
        for (String a : list) {
            sb.append(a).append("\n");
        }

        System.out.println(sb);
    }

}

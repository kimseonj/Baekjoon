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
 * 14
push 1
push 2
top
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
top
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Deque<String> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            switch(st.nextToken()) {
                case "push":
                    stack.push(st.nextToken());
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    };
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.peek()).append("\n");
                    }
            }    
        }

        System.out.println(sb);
    }

}

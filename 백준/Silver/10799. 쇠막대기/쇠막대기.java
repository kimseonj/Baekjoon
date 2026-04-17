import java.io.*;
import java.util.*;

/** 
 * 
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Deque<Character> stack = new ArrayDeque<>();
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else {
                stack.pop();

                
                if (s.charAt(i - 1) == '(') {
                    // 레이저
                    answer += stack.size();
                } else {
                    // 막대기
                    answer += 1;
                }   
            }
        }
        
        System.out.println(answer);
    }
}
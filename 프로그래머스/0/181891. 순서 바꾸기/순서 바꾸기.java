import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] b = Arrays.copyOfRange(num_list, 0, n);
        int[] a = Arrays.copyOfRange(num_list, n, num_list.length);
        
        int[] answer = new int[num_list.length];
        
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            answer[idx++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            answer[idx++] = b[i];
        }
        
        return answer;
    }
}
import java.util.*;
    
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 1; i < 65; i++) {
            int a = Integer.parseInt(Integer.toBinaryString(i)) * 5;    
            if (l <= a && a <= r) {
                answer.add(a);
            }
        }
        
        if (answer.size() == 0) {
            answer.add(-1);
        }
        
        return answer.stream()
                .mapToInt(Integer::intValue)
            .toArray();
    }
}
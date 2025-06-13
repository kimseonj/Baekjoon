import java.util.*;

class Solution {
    public int[][] solution(int n) {
        int[][] answer = {};
        
        ArrayList<int[]> result = new ArrayList<>();
        hanoi(n, 1, 3, 2, result);
        
        return result.toArray(answer);
    }
    
    public static void hanoi(int n, int start, int end, int mid, List<int[]> result) {
        if (n == 1) {
            result.add(new int[]{start, end});
            return;
        }

        hanoi(n-1, start, mid, end, result);
        result.add(new int[]{start, end});
        hanoi(n-1, mid, end, start, result);
    }
}
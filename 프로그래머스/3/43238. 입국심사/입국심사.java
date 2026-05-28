class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        
        long left = 0;
        long right = (long) getMax(times) * n;
        while (left <= right) {
            long mid = (left + right) / 2;
            
            long count = 0;
            for (int time : times) {
                count += mid / time;
            }
            
            if (count >= n) {
                answer = mid;
            }
            
            if (count < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return answer;
    }
    
    public static int getMax(int[] times) {
        int max = 0;
        for (int i : times) {
            max = max < i ? i : max;
        }
        
        return max;
    }
}
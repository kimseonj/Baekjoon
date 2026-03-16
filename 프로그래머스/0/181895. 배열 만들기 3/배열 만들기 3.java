class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a1 = intervals[0][0];
        int a2 = intervals[0][1];
        int b1 = intervals[1][0];
        int b2 = intervals[1][1];
        int num = a2 - a1 + b2 - b1 + 2;
        int[] answer = new int[num];
        
        int j = 0;
        for (int i = a1; i <= a2; i++) {
            answer[j++] = arr[i];
        }
        for (int i = b1; i <= b2; i++) {
            answer[j++] = arr[i];
        }
        
        return answer;
    }
}
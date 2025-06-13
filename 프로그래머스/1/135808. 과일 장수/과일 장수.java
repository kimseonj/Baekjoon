class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        int[] count = new int[k];
        for (int i : score) {
            count[i-1]++;
        }

        System.out.println(count);

        int max = 0;
        for (int i = k-1; i >= 0; i--) {
            max += count[i];
            while (max >= m) {
                answer += (i+1) * m;
                max -= m;
            }
        }

        return answer;
    }
}

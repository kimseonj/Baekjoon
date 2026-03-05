class Solution {
    public String solution(String my_string, int[] indices) {
        // indices를 Set으로 변환해서 O(1) 조회
        boolean[] toDelete = new boolean[my_string.length()];
        for (int idx : indices) {
            toDelete[idx] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (!toDelete[i]) {
                sb.append(my_string.charAt(i));
            }
        }

        return sb.toString();
    }
}
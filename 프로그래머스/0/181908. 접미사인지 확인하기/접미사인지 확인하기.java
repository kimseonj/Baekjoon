class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;

        String[] suffix = new String[my_string.length()];

        for (int i = 0; i < my_string.length() ; i++) {
            suffix[i] = my_string.substring(i, my_string.length());
        }

        for (String suf : suffix) {
            if (suf.equals(is_suffix)) {
                answer = 1;
            }
        }

        return answer;
    }
}
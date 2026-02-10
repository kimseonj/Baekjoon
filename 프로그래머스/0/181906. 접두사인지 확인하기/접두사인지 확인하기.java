class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        String[] prefixs = new String[my_string.length()];
        
        for (int i = 0; i < my_string.length(); i++) {
            prefixs[i] = my_string.substring(0, i);
        }
        
        for (String prefix : prefixs) {
            if (prefix.equals(is_prefix)) {
                answer = 1;
            }
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String str = my_string.substring(s, e);
        String reverse = "";
        for (int i = e - s; i > 0 ; i--) {
            reverse = reverse + str.charAt(i - 1);
        }
        
        return my_string.substring(0, s - 1) + reverse + my_string.substring(e, my_string.length());
    }
}
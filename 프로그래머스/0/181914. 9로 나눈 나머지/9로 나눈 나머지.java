class Solution {
    public int solution(String number) {
        Long num = 0L;

        for (int i = 0 ; i < number.length(); i++) {
            num += number.charAt(i) - '0';
        }

        return (int) (num % 9);
    }
}
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int odd = 0;
        int even = 0;
        
        int i = 0;
        while(i < num_list.length) {
            odd += num_list[i++];
            
            if (i >= num_list.length) {
                break;
            }
            
            even += num_list[i++];
        }
        
        return odd > even ? odd : even;
    }
}
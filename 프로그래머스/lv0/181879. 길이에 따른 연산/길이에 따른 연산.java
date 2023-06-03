class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        if (num_list.length >= 11) {
            int result = 0;
            for (int i = 0; i < num_list.length; i++) {
                result += num_list[i];
            }
            answer = result;
        }
        
        else {
            int result = 1;
            for (int i = 0; i < num_list.length; i++) {
                result *= num_list[i];
            }
            answer = result;
        }
        
        return answer;
    }
}

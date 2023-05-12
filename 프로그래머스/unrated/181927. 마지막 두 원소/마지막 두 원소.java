class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        int num1 = num_list[num_list.length - 2];
        int num2 = num_list[num_list.length - 1];
        int temp;
        
        if (num2 > num1) {
            answer[answer.length - 1] = num2 - num1;
        }
        else {
            answer[answer.length - 1] = num2 * 2;
        }
        
        return answer;
    }
}
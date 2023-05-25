import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = num_list.length - 1; i >= 0; i--) {
            list.add(num_list[i]);
        }
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
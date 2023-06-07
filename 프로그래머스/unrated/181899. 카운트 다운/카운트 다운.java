import java.util.*;

class Solution {
    public int[] solution(int start, int end) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = start; i >= end; i--) {
            arr.add(i);
        }
        
        int[] answer = new int[arr.size()];
        
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}
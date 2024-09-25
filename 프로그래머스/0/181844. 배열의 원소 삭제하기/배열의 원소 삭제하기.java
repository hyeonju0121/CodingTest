import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {

        Set<Integer> set = new LinkedHashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        
        for (int i : delete_list) {
            if (set.contains(i)) {
                set.remove(i);
            }
        }
        
        int[] answer = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            answer[idx] = num;
            idx++;
        }
        
        return answer;
    }
}
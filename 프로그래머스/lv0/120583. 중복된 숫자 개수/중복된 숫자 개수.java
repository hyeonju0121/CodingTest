import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        if (map.get(n) == null) {
            answer = 0;
        }
        else {
            answer = map.get(n);
        }
        
        return answer;
    }
}
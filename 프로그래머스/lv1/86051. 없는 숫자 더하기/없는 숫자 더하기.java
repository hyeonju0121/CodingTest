import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, 0);
        }
        
        for (int n : numbers) {
            if (map.containsKey(n)) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
        }
        
        for (int key : map.keySet()) {
            if (map.get(key) == 0) {
                answer += key;
            }
        }

        return answer;
    }
}
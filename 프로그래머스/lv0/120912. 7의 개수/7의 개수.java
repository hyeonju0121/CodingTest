import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int n : array) {
            String temp = String.valueOf(n);
            Map<Integer, Integer> map = new HashMap<>();
            
            for (char c : temp.toCharArray()) {
                int num = Integer.parseInt(String.valueOf(c));
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            
            for (Integer key : map.keySet()) {
                if (key == 7) {
                    answer += map.get(key);
                }
            }
        }
        
        return answer;
    }
}
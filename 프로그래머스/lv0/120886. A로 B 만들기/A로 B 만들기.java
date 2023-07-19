import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        Map<Character, Integer> map = new HashMap<>();
        for (char c : before.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : after.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        
        for (char key : map.keySet()) {
            if (map.get(key) != map2.get(key)) {
                answer = 0;
                break;
            } 
            answer = 1;
        }
   
        return answer;
    }
}
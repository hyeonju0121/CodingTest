import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : my_string.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        
        for (char c : my_string.toCharArray()) {
            if (map.containsKey(c)) {
                answer += String.valueOf(c);
                map.remove(c);
            }
        }
        
        return answer;
    }
    
}
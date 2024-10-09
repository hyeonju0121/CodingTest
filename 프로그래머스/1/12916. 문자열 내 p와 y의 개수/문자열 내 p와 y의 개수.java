import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();
        
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (c == 'p' || c == 'y') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        
        if (map.get('p') == map.get('y')) {
            answer = true;
        }
        else {
            answer = false;
        }

        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : s1) {
            map.put(s, 0);
        }
        
        HashMap<String, Integer> map2 = new HashMap<>();
        for (String s : s2) {
            map2.put(s, 0);
        }
        
        for (String key : map.keySet()) {
            if (map2.containsKey(key)) {
                answer++;
            }
        }
        
        return answer;
    }
}
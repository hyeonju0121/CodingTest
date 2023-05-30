import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 0);
        map.put("e", 0);
        map.put("i", 0);
        map.put("o", 0);
        map.put("u", 0);
        
        String[] arr = my_string.split("");
        
        for (String s : arr) {
            if (map.containsKey(s)) {
                answer += "";
            }
            else {
                answer += s;
            }
        }
        
        return answer;
    }
}
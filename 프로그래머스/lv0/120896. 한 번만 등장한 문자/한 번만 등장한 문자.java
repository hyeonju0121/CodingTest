import java.util.*;

class Solution {
    public String solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char c : s.toCharArray()) { 
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        String temp = "";
        for (char key : map.keySet()) {
            if (map.get(key) == 1) {
                temp += Character.toString(key);
            }
        }
        
        char[] charArr = temp.toCharArray();
        Arrays.sort(charArr);
        
       String answer = new String(charArr);

        return answer;
    }
}
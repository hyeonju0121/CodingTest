import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        
        HashMap<Character, String> map = new HashMap<>();
        map.put('0', "a");
        map.put('1', "b");
        map.put('2', "c");
        map.put('3', "d");
        map.put('4', "e");
        map.put('5', "f");
        map.put('6', "g");
        map.put('7', "h");
        map.put('8', "i");
        map.put('9', "j");
        
        String ageStr = Integer.toString(age);
        for (int i = 0; i < ageStr.length(); i++) {
            char temp = ageStr.charAt(i);
            
            if (map.containsKey(temp)) {
                answer += map.get(temp);
            }
        }

        return answer;
    }
}
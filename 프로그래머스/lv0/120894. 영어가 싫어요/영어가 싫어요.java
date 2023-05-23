import java.util.*;

class Solution {
    public long solution(String numbers) {

        String result = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        
        String temp = "";
        for (char c : numbers.toCharArray()) {
            temp += Character.toString(c);
            
            if (map.containsKey(temp)) {
                result += Integer.toString(map.get(temp));
                temp = "";
            }
        }
        
        long answer = Long.parseLong(result);
        
        return answer;
    }
}
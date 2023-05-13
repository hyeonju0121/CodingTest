import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        my_string = my_string.toLowerCase();
        
        char[] data = my_string.toCharArray();
        Arrays.sort(data);
        
        for (char c : data) {
            answer += String.valueOf(c);
        }
        
        return answer;
    }
}
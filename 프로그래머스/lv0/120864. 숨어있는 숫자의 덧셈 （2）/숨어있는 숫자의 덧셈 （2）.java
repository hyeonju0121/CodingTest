import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.toLowerCase().replaceAll("[a-z]", ",");
        
        String[] arr = my_string.split(",");

        for (String s : arr) {
            if (s.length() != 0) {
                int num = Integer.parseInt(s);
                answer += num;
            }
        }

        return answer;
    }
}
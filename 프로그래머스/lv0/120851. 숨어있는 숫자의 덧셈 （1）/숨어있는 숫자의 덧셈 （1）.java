import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] arr = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] data = my_string.split("");
        int idx = 0;
        
        for (int i = 0; i < data.length; i++) {
            if (Arrays.asList(arr).contains(data[i])) {
                idx = Arrays.asList(arr).indexOf(data[i]);
                answer += Integer.parseInt(arr[idx]);
            }
        }
    
        return answer;
    }
}
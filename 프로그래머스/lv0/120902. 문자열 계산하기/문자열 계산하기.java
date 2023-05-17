import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] data = my_string.split(" ");
        
        boolean check = false;
        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0) { 
                answer += Integer.parseInt(data[i]);
                if (check == true) {
                    check = false;
                    answer *= -1;
                }
                
            }
            
            else { //  홀수 ->  연산자 인덱스 
                if (data[i].equals("+")) {
                    continue;
                }
                else {
                    answer *= -1;
                    check = true;
                }
            }
        }
        
        return answer;
    }
}
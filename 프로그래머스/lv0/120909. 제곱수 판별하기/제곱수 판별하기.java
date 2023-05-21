import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int num = 1;
        while (true) {
            double temp = Math.pow(num, 2);
            
            if (n < (int)temp) {
                answer = 2;
                break;
            }
            
            if (n == (int)temp) {
                answer = 1;
                break;
            }
            
            num++;
        }
        
        return answer;
    }
}
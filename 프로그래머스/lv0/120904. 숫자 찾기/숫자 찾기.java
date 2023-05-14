import java.util.*;

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String numStr = Integer.toString(num);
        String[] strArr = numStr.split("");
        
        String strK = Integer.toString(k);
        
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(strK)) {
                answer = i + 1;
                break;
            }
        }
        
        if (answer == 0) {
            answer = -1;
        }

        return answer;
    }
}
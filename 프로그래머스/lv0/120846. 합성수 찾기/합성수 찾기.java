import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        boolean[] check = new boolean[n+1];
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!check[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    check[j] = true;
                }
            }
        }

        for (boolean x : check) {
            if (x) {
                answer++;
            }
        }
        
        return answer;
    }
}
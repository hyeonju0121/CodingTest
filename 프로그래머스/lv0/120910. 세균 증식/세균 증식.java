class Solution {
    public int solution(int n, int t) {
        int answer = n;
        
        int num = 1;
        while (true) {
            if (num == t) {
                answer *= 2;
                break;
            }
            
            answer *= 2;
            
            num++;
            
        }
        return answer;
    }
}
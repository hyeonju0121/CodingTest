class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        int cur = code;
        for (int i = code; i < cipher.length() + 1; i++) {
            if (cur > cipher.length()) {
                break;
            }
            
            answer += cipher.substring(cur - 1, cur);
            cur += code;
        }
        
        return answer;
    }
}
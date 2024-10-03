class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
       
        String[] list = {"aya", "ye", "woo", "ma"};
        
        for (String str : babbling) {
            for (String temp : list) {
                if (str.contains(temp)) {
                    str = str.replace(temp, " ");
                }
            }
            
            if (str.isBlank()) {
                answer++;
            }
        }
        
        return answer;
    }
}
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] list = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (babbling[i].contains(list[j])) {
                    babbling[i] = babbling[i].replace(list[j], " ");
                }
            }

            boolean check = false;
            for (int k = 0; k < babbling[i].length(); k++) {
                if (babbling[i].charAt(k) != ' ') {
                    check = true; 
                    break;
                }
            }
            
            if (!check) {
                answer++;
            }
        }
        
        return answer;
    }
}
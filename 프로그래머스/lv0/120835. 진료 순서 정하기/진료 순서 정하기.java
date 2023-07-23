class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        int temp = 0;
        for (int i = 0; i < emergency.length; i++) {
            int score = 0;
            int idx = 0;
            
            for (int j = 0; j < emergency.length; j++) {
                if (score < emergency[j]) {
                    score = emergency[j];
                    idx = j;
                }
            }
            
            temp++;
            emergency[idx] = 0;
            answer[idx] = temp;
        }
          
        return answer;
    }
}
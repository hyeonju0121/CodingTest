class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String numStr = Integer.toString(order);
        String[] arr = numStr.split("");
        
        for (String s : arr) {
            if (s.equals("3") || s.equals("6") || s.equals("9")) {
                answer++;
            }
        }
        
        return answer;
    }
}
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] arr = s.split(" ");
        
        int temp = 0;
        for (String x : arr) {
            if (!x.equals("Z")) {
                answer += Integer.parseInt(x);
                temp = Integer.parseInt(x);
            } else {
                if (temp < 0) {
                    answer += temp * -1;
                } else {
                    answer -= temp;
                }
            }
        }
        
        return answer;
    }
}
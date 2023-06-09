class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String num1 = Integer.toString(a);
        String num2 = Integer.toString(b);
        String temp = num1 + num2;
        
        int result1 = Integer.parseInt(temp);
        int result2 = 2 * a * b;
        
        if (result1 > result2) {
            answer = result1;
        } else {
            answer = result2;
        }
        
        return answer;
    }
}
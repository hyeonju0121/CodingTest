import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        // 0번 부터 s-1 번 만큼 실행
        // 한번 과정이 끝날때마다 문자열을 갱신 -> 첫번째 문자열을 뒤로 
        // 한번 과정할때마다 마지막에, 스택이 비어있는지 확인 해야함 -> 비어있다면 올바른 괄호니까 answer++;
        
        int cnt = s.length() - 1;
        boolean check = true;
        while (cnt != 0) {
            Stack<Character> stack = new Stack<>();
            
            for (char c : s.toCharArray()) {
                if (c == '[' || c == '(' || c == '{') {
                    stack.push(c);
                } else {
                    if (!stack.isEmpty()) {
                        if (c ==']' && stack.peek() == '[') {
                            stack.pop();
                        } else if (c ==')' && stack.peek() == '(') {
                            stack.pop();
                        } else if (c =='}' && stack.peek() == '{') {
                            stack.pop();
                        }
                    } else {
                        check = false;
                        break;
                    }
                }
            }
            
            if (stack.isEmpty() && check) {
                answer++;
            }
            
            // 문자열 갱신
            char c = s.charAt(0);
            s = s.substring(1, s.length()) + c;
            
            cnt--;
            check = true;
        } 
        
        return answer;
    }
}
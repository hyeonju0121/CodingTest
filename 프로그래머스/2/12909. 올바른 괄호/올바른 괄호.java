import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else { // 이미 스택이 비어있는데 ')' 짝이 없으니까 바로 종료 
                    return false;
                }
            }
        }
        
        // 올바른 괄호짝이라면 정상적으로 스택이 비어있어야 함
        if (stack.isEmpty()) {
            return answer;
        } else {
            answer = false;
        }

        return answer;
    }
}
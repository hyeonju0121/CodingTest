package Ch05.ch05_02;

import java.util.Scanner;
import java.util.Stack;

/**
 * 괄호 문자 제거
 * ( ) 사이에 존재하는 모든 문자 제거하고 남은 문자만 출력
 */
public class Main {
    public String solution(String str) {
        String answer = "";

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(c);
            }
        }

        for (char c : stack) {
            answer += c;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(main.solution(str));
    }
}

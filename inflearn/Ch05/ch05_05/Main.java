package Ch05.ch05_05;

import java.util.Scanner;
import java.util.Stack;

/**
 * 쇠막대기
 * () -> 레이저
 * 쇠막대기의 왼쪽 끝은 (, 오른쪽 끝은 ) 로 표현
 */
public class Main {
    public int solution (String str) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();

        char temp = ' ';
        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else { // 닫는 괄호
                stack.pop();
                if (temp == '(') { // 레이저
                    answer += stack.size();
                } else { // 쇠막대기
                    answer++;
                }
            }
            temp = c;
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

package Ch05.ch05_04;

import java.util.Scanner;
import java.util.Stack;

/**
 * 후위식 연산
 */
public class Main {
    public int solution (String str) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        // char c 가 숫자인지 확인하는 메서드 : Character.isDigit(char c)
        // char -> int : (int) c - '0'
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push((int)c - '0');
            } else {
                int n1 = stack.pop();
                int n2 = stack.pop();
                if (c == '+') stack.push(n2  +n1);
                else if (c == '-') stack.push(n2 - n1);
                else if (c == '*') stack.push(n2 * n1);
                else if (c == '/') stack.push(n2 / n1);
                }
            }

        answer = stack.peek();

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(main.solution(str));
    }
}

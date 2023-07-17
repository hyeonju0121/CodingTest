package Ch01.ch01_6;

/*
=========== 문제 ============
소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램 작성
*/

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = String.valueOf(str.charAt(0));
        String[] arr = str.split("");

        for (int i = 1; i < arr.length; i++) {
            boolean current = true;
            String temp = arr[i];

            for (int j = 0; j < answer.length(); j++) {
                String check = String.valueOf(answer.charAt(j));
                if (temp.equals(check)) {
                    current = false;
                    break;
                }
            }

            if (current) {
                answer += temp;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Main answer = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(answer.solution(str));

    }
}

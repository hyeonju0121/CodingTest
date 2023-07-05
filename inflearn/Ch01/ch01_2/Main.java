package Ch01.ch01_2;

/*
=========== 문제 ============
대문자와 소문자가 같이 존재하는 문자열을 입력받아
대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램 작성
*/

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c) == true) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
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

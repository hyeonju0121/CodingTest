package Ch01.ch01_1;

import java.util.Scanner;

/*
=========== 문제 ============
한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가
입력받은 문자열에 몇 개 존재하는 지 알아내는 프로그램 작성
- 대소문자 구분 x
*/
public class Main {
    public int solution(String str, char c) {
        str = str.toLowerCase();
        c = Character.toLowerCase(c);

        int answer = 0;
        for (char temp : str.toCharArray()) {
            if (temp == c) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main answer = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(answer.solution(str, c));
    }
}

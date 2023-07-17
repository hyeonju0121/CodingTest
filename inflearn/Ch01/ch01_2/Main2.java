package Ch01.ch01_2;

import java.util.Scanner;

public class Main2 {
    public String solution(String str) {
        String answer = "";

        // 아스키 넘버 범위 -> 대문자 : 65 ~ 90, 소문자 : 97 ~ 122
        for (char c : str.toCharArray()) {
            if (c >= 65 && c <= 90) { // 소문자
                answer += (char)(c + 32);
            } else {
                answer += (char)(c - 32);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main2 answer = new Main2();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(answer.solution(str));
    }
}

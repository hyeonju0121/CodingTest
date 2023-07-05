package Ch01.ch01_3;

/*
=========== 문제 ============
한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램 작성
- 문장 속의 각 단어는 공백으로 구분
*/

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        String[] arr = str.split(" ");

        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > len) {
                len = arr[i].length();
                answer = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main answer = new Main();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(answer.solution(str));

    }
}

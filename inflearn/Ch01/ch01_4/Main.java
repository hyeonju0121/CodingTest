package Ch01.ch01_4;

/*
=========== 문제 ============
N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램 작성
*/

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";

        String[] arr = str.split("");
        for (int i = arr.length - 1; i >= 0; i--) {
            answer += arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Main answer = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            System.out.println(answer.solution(str));
        }
    }
}

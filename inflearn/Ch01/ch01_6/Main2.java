package Ch01.ch01_6;

import java.util.Scanner;

public class Main2 {
    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == str.indexOf(str.charAt(i))) {
                answer += String.valueOf(str.charAt(i));
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

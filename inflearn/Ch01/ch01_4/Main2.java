package Ch01.ch01_4;

import java.util.Scanner;

public class Main2 {
    public String solution(String str) {
        String answer = "";

        for (int i = str.length() - 1; i  >= 0; i--) {
            answer += str.charAt(i);
        }

        return answer;
    }


    public static void main(String[] args) {
        Main2 answer = new Main2();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            System.out.println(answer.solution(str));
        }
    }
}

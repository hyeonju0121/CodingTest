package Ch01.ch01_12;

import java.util.Scanner;

public class Main2 {
    public String solution(int n, String str) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            String temp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(temp, 2); // 2진수 -> 10진수
            answer += (char) num;

            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2 answer = new Main2();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(answer.solution(n, str));
    }
}

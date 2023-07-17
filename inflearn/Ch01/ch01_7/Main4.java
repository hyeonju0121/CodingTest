package Ch01.ch01_7;

import java.util.Scanner;

public class Main4 {
    public String solution(String str) {
        String answer = "YES";

        str = str.toLowerCase();

        int len = str.length() / 2;
        int endIdx = str.length() - 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != str.charAt(endIdx)) {
                answer = "NO";
                break;
            }
            endIdx--;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main4 answer = new Main4();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(answer.solution(str));
    }
}

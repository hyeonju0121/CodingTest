package Ch01.ch01_8;

import java.util.Scanner;

// replaceAll - 정규식 이용 풀이

public class Main3 {
    public String solution(String str) {
        String answer = "YES";

        str = str.toLowerCase().replaceAll("[^a-z]", "");

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
        Main3 answer = new Main3();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(answer.solution(str));
    }
}

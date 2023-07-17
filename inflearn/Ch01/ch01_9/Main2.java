package Ch01.ch01_9;

import java.util.Scanner;

// replaceAll -> 정규식 이용 풀이
public class Main2 {
    public int solution(String str) {
        int answer = 0;

        str = str.toLowerCase().replaceAll("[a-z]", "");

        answer = Integer.parseInt(str);

        return answer;
    }

    public static void main(String[] args) {
        Main2 answer = new Main2();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(answer.solution(str));
    }
}

package Ch01.ch01_7;

import java.util.Scanner;

// StringBuilder -> reverse 메서드 이용 풀이
public class Main3 {
    public String solution(String str) {
        String answer = "";

        str = str.toLowerCase();

        String reverse = new StringBuilder(str).reverse().toString();

        if (reverse.equals(str)) {
            answer = "YES";
        } else {
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main3 answer = new Main3();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(answer.solution(str));
    }
}

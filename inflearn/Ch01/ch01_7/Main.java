package Ch01.ch01_7;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        String strToLower = str.toLowerCase();

        String temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            temp += String.valueOf(strToLower.charAt(i));
        }

        if (temp.equals(strToLower)) {
            answer = "YES";
        } else {
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main answer = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(answer.solution(str));
    }
}

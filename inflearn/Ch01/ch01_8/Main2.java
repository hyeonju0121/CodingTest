package Ch01.ch01_8;

import java.util.Scanner;

public class Main2 {
    public String solution(String str) {
        String answer = "";
        str = str.toLowerCase();

        String before = "";
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                before += String.valueOf(c);
            }
        }

        String after = "";
        for (int i = before.length() - 1; i >= 0; i--) {
            after += String.valueOf(before.charAt(i));
        }

        if (before.equals(after)) {
            answer = "YES";
        } else {
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main2 answer = new Main2();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(answer.solution(str));
    }
}

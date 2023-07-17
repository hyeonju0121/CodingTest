package Ch01.ch01_3;

import java.util.Scanner;

public class Main2 {
    public String solution(String str) {
        String answer = "";

        int max = Integer.MIN_VALUE;
        int pos;

        while((pos = str.indexOf(' ')) != -1) {
            String temp = str.substring(0, pos);

            int len = temp.length();

            if (len > max) {
                max = len;
                answer = temp;
            }

            str = str.substring(pos + 1);
        }

        if (str.length() > max) {
            answer = str;
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

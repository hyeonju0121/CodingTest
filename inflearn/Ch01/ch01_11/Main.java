package Ch01.ch01_11;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";

        char[] strToCharArray = str.toCharArray();

        int cnt = 0;
        char check = ' ';
        for (int i = 0; i < strToCharArray.length; i++) {
            String temp = "";
            char current = strToCharArray[i];

            for (int j = i; j < strToCharArray.length; j++) {
                if (check != strToCharArray[j] && current == strToCharArray[j]) {
                    cnt++;
                } else {
                    break;
                }
            }

            if (cnt != 0) {
                if (cnt > 1) {
                    temp = String.valueOf(current) + String.valueOf(cnt);
                } else {
                    temp = String.valueOf(current);
                }
            }
            answer += temp;
            check = current;
            cnt = 0;
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

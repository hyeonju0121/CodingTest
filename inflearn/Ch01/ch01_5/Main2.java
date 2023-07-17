package Ch01.ch01_5;

import java.util.Scanner;

public class Main2 {
    public boolean alphaCheck(char c) {
        if (Character.isLowerCase(c) || Character.isUpperCase(c)) {
            return true;
        }
        return false;
    }

    public String solution(String str) {
        String answer = "";

        char[] strToCharArray = str.toCharArray();

        int idx = strToCharArray.length - 1;

        for (int i = 0; i < strToCharArray.length; i++) {
            char c = strToCharArray[i];

            if (alphaCheck(c)) {
                for (int j = idx; j >= 0; j--) {
                    char temp = strToCharArray[j];
                    if (alphaCheck(temp)) {
                        answer += temp;
                        idx = j - 1;
                        break;
                    }
                }
            } else {
                answer += c;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main2 answer = new Main2();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(answer.solution(str));

    }
}

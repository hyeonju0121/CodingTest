package Ch01.ch01_12;

import java.util.Scanner;

public class Main {
    public String solution(int num, String str) {
        String answer = "";
        String temp = "";

        int startIdx = 0;
        int endIdx = 7;
        for (int i = 0; i < num; i++) {
            int binary = 0;
            for (int j = startIdx; j < endIdx; j++) {
                if (str.charAt(j) == '#') {
                    temp += "1";
                } else {
                    temp += "0";
                }
            }
            binary = Integer.valueOf(temp, 2);
            char c = (char) binary;
            System.out.println(temp + "--> " + binary + "--> " + c);

            answer += String.valueOf(c);

            temp = "";
            startIdx = endIdx;
            endIdx = startIdx + 7;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main answer = new Main();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str = sc.next();

        System.out.println(answer.solution(num, str));
    }
}

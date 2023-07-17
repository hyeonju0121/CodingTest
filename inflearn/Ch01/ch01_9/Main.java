package Ch01.ch01_9;

import java.util.Scanner;

public class Main {
    public int solution(String str) {
        int answer = 0;

        str = str.toLowerCase();
        String temp = "";
        for (char c : str.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                temp += String.valueOf(c);
            }
        }
        answer = Integer.parseInt(temp);

        return answer;
    }

    public static void main(String[] args) {
        Main answer = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(answer.solution(str));
    }
}

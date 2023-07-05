package Ch01.ch01_5;

/*
=========== 문제 ============
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램 작성
*/

import java.util.Scanner;

public class Main {
    public String[] reverseArr(String str) {
        String[] arr = str.split("");
        String temp = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            temp += arr[i];
        }

        String[] answer = temp.split("");

        return answer;
    }

    public String solution(String str) {
        String answer = "";
        String lowerStr = str.toLowerCase();

        String[] arr = str.split("");

        String alpha = "";
        int idx = 0;
        for (char temp : lowerStr.toCharArray()) {
            if (Character.isLowerCase(temp) == true) {
                alpha += arr[idx];
            }
            idx++;
        }

        String[] reverse = reverseArr(alpha);

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            String tempStr= arr[i].toLowerCase();
            char tempChar = tempStr.charAt(0);

            if (Character.isLowerCase(tempChar) == true) {
                answer += reverse[cnt];
                cnt++;
            } else {
                answer += arr[i];
            }
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

package Ch01.ch01_5;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public String solution(String str) {
        char[] charArray = str.toCharArray();

        int left = 0;
        int right = str.length() - 1;
        for (char x : charArray) {

            if (Character.isLowerCase(x) || Character.isUpperCase(x)) { // x 가 알파벳인 경우에만 right--;
                while(left < right) {
                    char c = charArray[right];

                    if (Character.isUpperCase(c) || Character.isLowerCase(c)) {
                        charArray[right] = x;
                        charArray[left] = c;

                        right--;
                        break;
                    } else {
                        right--;
                    }
                }
            }
            left++; // x 가 특수문자이면 left++;
        }

        String answer = String.valueOf(charArray);

        return answer;
    }

    public static void main(String[] args) {
        Main3 answer = new Main3();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(answer.solution(str));
    }
}

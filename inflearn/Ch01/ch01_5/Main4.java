package Ch01.ch01_5;

import java.util.Scanner;

public class Main4 {
    public String solution(String str) {
        String answer = "";

        char[] arr = str.toCharArray();

        int left = 0;
        int right = str.length() - 1;
        while(left < right) {
            if (!Character.isAlphabetic(arr[left])) { // arr[left] 가 특수문자인 경우
                left++;
            }
            else if (!Character.isAlphabetic(arr[right])) { // arr[right] 가 특수문자인 경우
                right--;
            } else { // arr[left] 와 arr[right] 모두 알파벳인 경우
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        answer = String.valueOf(arr);

        return answer;
    }

    public static void main(String[] args) {
        Main4 answer = new Main4();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(answer.solution(str));
    }
}

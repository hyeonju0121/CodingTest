package Ch01.ch01_7;

import java.util.Scanner;

// left, right 값 교환 풀이
public class Main2 {
    public String solution(String str) {
        String answer = "";
        str = str.toLowerCase();

        char[] arr = str.toCharArray();

        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        String temp = String.valueOf(arr);

        if (temp.equals(str)) {
            answer = "YES";
        } else {
            answer = "NO";
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

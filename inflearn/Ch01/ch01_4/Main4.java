package Ch01.ch01_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
    public ArrayList<String> solution(int n, String[] arr) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : arr) {
            char[] charArr = x.toCharArray(); // [g, o, o, d]

            int left = 0;
            int right = x.length() - 1;

            while (left < right) {
                char c = charArr[left];
                charArr[left] = charArr[right];
                charArr[right] = c;

                left++;
                right--;
            }
            String temp = new String(charArr);
            answer.add(temp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main4 answer = new Main4();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (String s : answer.solution(n, arr)) {
            System.out.println(s);
        }
    }
}

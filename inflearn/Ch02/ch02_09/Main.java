package Ch02.ch02_09;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int solution(int n, int[][] arr) {
        int answer = 0;

        // 각 행의 합
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 0; j < n; j++) {
                temp += arr[i][j];
            }
            if (answer < temp) {
                answer = temp;
            }
        }

        // 각 열의 합
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 0; j < n; j++) {
                temp += arr[j][i];
            }
            if (answer < temp) {
                answer = temp;
            }
        }

        // 두 대각선의 합
        int idx = n - 1;
        int left = 0;
        int right = 0;
        for (int i = 0; i < n; i++) {
            left += arr[i][i];
            right += arr[i][idx];

            idx--;
        }

        int temp = 0;
        if (left  < right) {
            temp = right;
        } else {
            temp = left;
        }

        if (answer < temp) {
            answer = temp;
        }


        return answer;
    }

    public static void main(String[] args) {
        Main answer = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(answer.solution(n, arr));
    }
}

package Ch02.ch02_09;

import java.util.Scanner;

/**
 * 격자판 최대합
 * 각 행의 합, 각 열의 합, 두 대각선의 합 중 가장 큰 합 출력
 */
public class Main2 {
    public int solution(int num, int[][] arr) {
        int answer = 0;

        int max = 0;
        // 각 행의 합
        for(int i = 0; i < num; i++) {
            int temp = 0;
            for(int j = 0; j < num; j++) {
                temp += arr[i][j];
            }

            if(max < temp) {
                max = temp;
            }
        }

        // 각 열의 합
        for (int i = 0; i < num; i++) {
            int temp = 0;
            for (int j = 0; j < num; j++) {
                temp += arr[j][i];
            }

            if(max < temp) {
                max = temp;
            }
        }

        // 각 대각선의 합
        int right = 0;
        int left = 0;
        int numTemp = num - 1;
        for(int i = 0; i < num; i++) {
            right += arr[i][i];
            left += arr[i][numTemp];

            numTemp--;
        }

        if (max < right) {
            max = right;
        } else if (max < left) {
            max = left;
        }

        answer = max;
        return answer;
    }

    public static void main(String[] args) {
        Main2 main = new Main2();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[][] arr = new int[num][num];
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(main.solution(num, arr));
    }
}

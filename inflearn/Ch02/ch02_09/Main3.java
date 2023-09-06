package Ch02.ch02_09;

import java.util.Scanner;

public class Main3 {
    public int solution(int num, int[][] arr){
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < num; i++) {
            int sum1 = 0; // 행의 합
            int sum2 = 0; // 열의 합

            for (int j = 0; j < num; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < num; i++) {
            sum1 += arr[i][i]; // 왼쪽 대각선의 합
            sum2 += arr[i][num-i-1]; // 오른쪽 대각선의 합
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);


        return answer;
    }

    public static void main(String[] args) {
        Main3 main = new Main3();
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

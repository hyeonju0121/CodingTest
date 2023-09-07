package Ch03.ch03_03;

import java.util.Scanner;

/**
 * 최대 매출
 * N일 동안의 매출기록에서 연속된 K일 동안 최대 매출액이 얼마인지 구하기
 */
public class Main {
    public int solution (int n, int k, int[] arr) {
        int window = 0;
        for (int i = 0; i < k; i++) {
            window += arr[i];
        }

        int answer = window;

        for (int i = k; i < n-k+1; i++) {
            window += (arr[i] - arr[i - k]);
            answer = Math.max(window, answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(main.solution(n, k, arr));
    }
}

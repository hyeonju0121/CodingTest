package Ch02.ch02_07;

import java.util.Scanner;

public class Main2 {
    public int solution(int n, int[] arr) {
        int answer = 0;

        int score = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                score++;
            } else {
                score = 0;
            }

            answer += score;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main2 answer = new Main2();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(answer.solution(n, arr));
    }
}

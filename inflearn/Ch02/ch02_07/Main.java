package Ch02.ch02_07;

import java.util.Scanner;

public class Main {
    public int solution(int n, int[] arr) {
        int answer = arr[0];

        int score = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] == 1) {
                if (arr[i-1] == 1) {
                    score = score + 1;
                } else {
                    score += 1;
                }
            } else {
                score = 0;
            }
            answer += score;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main answer = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(answer.solution(n, arr));
    }
}

package Ch02.ch02_08;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int current = arr[i];
            int rank = 1;

            for (int j = 0; j < n; j++) {
                if (current < arr[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
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

        for (int x : answer.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}

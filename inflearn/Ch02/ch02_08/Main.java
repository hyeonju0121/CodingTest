package Ch02.ch02_08;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        int max = Integer.MIN_VALUE;
        int copyMax = 1;
        int rank = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            for (int k = 0; k < n; k++) {
                if (arr[k] == max && copyMax == max) {
                    answer[k] = rank;
                    arr[k] = Integer.MIN_VALUE;
                    rank++;
                    break;
                } else if (arr[k] == max) {
                    rank++;
                    answer[k] = rank;
                    arr[k] = Integer.MIN_VALUE;
                    break;

                }

            }
            copyMax = max;
            max = Integer.MIN_VALUE;
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

        for (int x : answer.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
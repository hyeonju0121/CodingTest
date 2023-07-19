package Ch02.ch02_02;

import java.util.Scanner;

public class Main {
    public int solution(int n, int[] arr) {
        int answer = 1;

        int maxHeight = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxHeight) {
                maxHeight = arr[i];
                answer++;
            }
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

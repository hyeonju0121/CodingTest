package Ch02.ch02_03;

import java.util.Scanner;

public class Main {
    public String[] solution(int n, int[] A, int[] B) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            if (A[i] == 1 && B[i] == 3) {
                answer[i] = "A";
            } else if (A[i] == 2 && B[i] == 1) {
                answer[i] = "A";
            } else if (A[i] == 3 && B[i] == 2) {
                answer[i] = "A";
            } else if (A[i] == B[i]) {
                answer[i] = "D";
            } else {
                answer[i] = "B";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main answer = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        for (String x : answer.solution(n, A, B)) {
            System.out.println(x);
        }
    }
}

package Ch02.ch02_10;

import java.util.Scanner;

public class Main {
    public int solution(int n, int[][] arr) {
        int answer = 0;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        boolean check = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int current = arr[i][j];

                for (int k = 0; k < 4; k++) {
                    int x = i + dx[k];
                    int y = j + dy[k];
                    int search = 0;

                    if (x < 0 || x == n) {
                        search = 0;
                    } else if (y < 0 || y == n) {
                        search = 0;
                    } else {
                        search = arr[x][y];
                    }

                    if (current < search) {
                        check = false;
                        break;
                    } else {
                        check = true;
                    }
                }

                if (check) {
                    answer++;
                }
            }
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

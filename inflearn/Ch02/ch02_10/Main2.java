package Ch02.ch02_10;

import java.util.Scanner;

/**
 * 봉우리
 * 격자판 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역
 * 봉우리 지역이 몇 개인지 출력
 */
public class Main2 {
    public int solution(int n, int[][] arr) {
        int answer = 0;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                boolean check = true;

                for(int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if(nx < 0 || nx >= n || ny < 0 || ny >= n) {
                        continue;
                    }

                    if(arr[i][j] <= arr[nx][ny]) {
                        check = false;
                        break;
                    }
                }
                if(check) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main2 main = new Main2();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(main.solution(n, arr));
    }
}

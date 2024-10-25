import java.util.*;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int m, n;
    static int[][] board;
    static boolean[][] check; // 익은 토마토 체크할 배열
    static int tomato = 0; // 총 토마토 개수
    static int answer = 0; // 익은 토마토 개수
    static int day = 0;
    static ArrayList<Point> list; // 초기 발견된 익은 토마토 좌표

    public void BFS() {
        Queue<Point> queue = new LinkedList<>();

        for (Point v : list) {
            queue.offer(v);
            check[v.x][v.y] = true; // 익은 토마토 추가
            answer++;
        }

        int len = queue.size();
        while (!queue.isEmpty()) {
            for (int i = 0; i < len; i++) {
                Point current = queue.poll();
                
                for (int j = 0; j < 4; j++) {
                    int nx = current.x + dx[j];
                    int ny = current.y + dy[j];

                    // 익지 않은 토마토인 경우
                    if (nx >= 1 && nx <= n && ny >= 1 && ny <= m &&
                        !check[nx][ny] && board[nx][ny] == 0) {
                        check[nx][ny] = true; // 익은 토마토 추가
                        board[nx][ny] = 1; // 익은 토마토 추가
                        answer++;

                        queue.offer(new Point(nx, ny));
                    }
                }
            }
            day++;

            if (answer == tomato) {
                queue.clear();
            }
            len = queue.size();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();

        board = new int[n + 1][m + 1]; // board 배열 초기화
        check = new boolean[n + 1][m + 1]; // check 배열 초기화
        list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] != -1) {
                    tomato++;
                }
                if (board[i][j] == 1) {
                    list.add(new Point(i, j)); // 초기 발견된 토마토 위치 저장
                    answer++;
                }
            }
        }

        if (tomato == answer) { // 처음부터 모두 익은 토마토가 들어온 경우
            System.out.println(0);
        } else {
            answer = 0;
            main.BFS();

            if (tomato == answer) { // 모두 익은 경우
                System.out.println(day);
            } else {
                System.out.println(-1);
            }
        }
    }
}

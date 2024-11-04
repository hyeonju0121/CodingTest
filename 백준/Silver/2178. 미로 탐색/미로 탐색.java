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
    static int[][] maze;
    static int[][] dis;
    static int n;
    static int m;

    public void BFS(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(0, 0)); // 시작 좌표
        maze[0][0] = 0; // 출발 좌표 방문 처리
        dis[0][0] = 1;

        int len = queue.size();
        while (!queue.isEmpty()) {
            for (int i = 0; i < len; i++) {
                Point current = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int nx = current.x + dx[j];
                    int ny = current.y + dy[j];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < m &&
                        maze[nx][ny] == 1) { // 이동할 수 있는지 조사
                        dis[nx][ny] = dis[current.x][current.y] + 1;
                        maze[nx][ny] = 0; // 방문처리

                        queue.offer(new Point(nx, ny));
                    }
                }
            }
            len = queue.size();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        maze = new int[n][m];
        dis = new int[n][m];
        for (int i = 0; i < n; i++) {
            String temp = sc.next();
            String[] tempArr = temp.split("");
            for (int j = 0; j < tempArr.length; j++) {
                maze[i][j] = Integer.parseInt(tempArr[j]);
            }
        }
        
        main.BFS(0, 0);

        System.out.println(dis[n-1][m-1]);
    }
}

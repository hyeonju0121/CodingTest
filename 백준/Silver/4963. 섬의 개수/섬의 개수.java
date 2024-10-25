import java.util.*;

/*
* 섬의 개수
* */
public class Main {
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int w, h;
    static int answer = 0;

    public void DFS(int x, int y, int[][] map) {
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < h && ny >= 0 && ny < w &&
                map[nx][ny] == 1) {
                map[nx][ny] = 0;
                DFS(nx, ny, map);
            }
        }
    }

    public void solution(int[][] map) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (map[i][j] == 1) {
                    answer++;
                    map[i][j] = 0; // 시작점 0 으로 처리
                    DFS(i, j, map);
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        while(true) {
            w = sc.nextInt();
            h = sc.nextInt();

            if (w == 0 && h == 0) {
               break;
            }

            int[][] map = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            main.solution(map);
            System.out.println(answer);
            answer = 0;
        }
    }
}

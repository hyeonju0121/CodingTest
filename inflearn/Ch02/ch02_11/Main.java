package Ch02.ch02_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 임시 반장 구하기
 * 1~5학년 까지 한번이라도 같은 반이었던 사람이 가장 많은 학생 -> 임시반장
 * 임시반장이 될 수 있는 학새잉 여러명인 경우에는 그 중 가장 작은 번호 출력
 */
public class Main {
    public int solution(int n, int[][] arr) {
        int answer = 0;

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 1; i < n + 1; i++) {
            ArrayList<Integer> tmp = new ArrayList<>();
            map.put(i, tmp);
        }

        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                ArrayList<Integer> list = map.get(j + 1);
                for (int k = 0; k < n; k++) {
                    if (j == k) continue;
                    if (arr[j][i] == arr[k][i]) {
                        int temp = k + 1;
                        if (!list.contains(temp)) {
                            list.add(temp);
                        }
                    }
                }
            }
        }
        int max = 0;
        for (int key : map.keySet()) {
            if (max < map.get(key).size()) {
                max = map.get(key).size();
                answer = key;
            }
        }
        if (answer == 0) {
            answer = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(main.solution(n, arr));
    }
}

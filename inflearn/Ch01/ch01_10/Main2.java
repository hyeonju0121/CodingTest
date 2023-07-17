package Ch01.ch01_10;

import java.util.Scanner;

public class Main2 {
    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];

        int dis = 1000;
        // 왼쪽 c 기준으로 거리 계산
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != c) {
                dis++;
            } else {
                dis = 0;
            }
            answer[i] = dis;
        }

        dis = 1000;
        // 오른쪽 c 기준으로 거리 계산
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) != c) {
                dis++;
                answer[i] = Math.min(dis, answer[i]);
            } else {
                dis = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2 answer = new Main2();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);

        for (int x : answer.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}

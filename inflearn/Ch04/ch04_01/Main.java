package Ch04.ch04_01;

import java.util.HashMap;
import java.util.Scanner;


/**
 * 학급 회장
 * 기호 A, B, C, D, E 후보 등록
 * 투표용지에는 반 학생들이 자기가 선택한 후보의 기호가 쓰여져 있음
 * 어떤 기호의 후보가 학급 회장이 되었는 지 출력
 */
public class Main {
    public char solution(int n, String str) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(main.solution(n, str));
    }
}

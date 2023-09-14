package Ch04.ch04_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 매출액의 종류
 * N일간의 매출기록과 연속구간의 길이 K가 주어지면
 * 첫 번째 구간부터 각 구간별 매출액의 종류를 출력
 */
public class Main2 {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        answer.add(map.size());

        for (int i = k; i < n; i++) {
            map.put(arr[left], map.get(arr[left])-1);
            if (map.get(arr[left]) == 0) {
                map.remove(arr[left]);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            left++;

            answer.add(map.size());
        }

        return answer;
    }

    public static void main(String[] args) {
        Main2 main = new Main2();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int answer : main.solution(n, k, arr)) {
            System.out.print(answer + " ");
        }
    }
}

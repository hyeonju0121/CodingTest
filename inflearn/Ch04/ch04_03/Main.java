package Ch04.ch04_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 매출액의 종류
 * N일간의 매출기록과 연속구간의 길이 K가 주어지면
 * 첫 번째 구간부터 각 구간별 매출액의 종류를 출력
 */
public class Main {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int size = (n / k) * k;
        for (int left = 0; left < size; left++) {
            int cnt = 0;
            int right = left;

            HashMap<Integer, Integer> map = new HashMap<>();
            while (cnt < k) {
                map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
                cnt++;
                right++;
            }
            answer.add(map.size());
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
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

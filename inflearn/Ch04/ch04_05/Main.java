package Ch04.ch04_05;


import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * N 장의 카드에서 3장을 뽑을 수 있는 모든 경우 기록
 * 기록한 값 중 K 번째로 큰 수 출력
 */
public class Main {
    public int solution(int n, int k, int[] arr) {
        int answer = -1;

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (int x : set) {
            cnt++;
            if (cnt == k) return answer = x;
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
        System.out.println(main.solution(n, k, arr));
    }
}

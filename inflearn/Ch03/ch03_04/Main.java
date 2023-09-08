package Ch03.ch03_04;

import java.util.Scanner;

/**
 * 연속 부분수열
 * N개의 수로 이루어진 수열이 주어진다.
 * 이 수열에서 연속 부분수열의 합이 특정숫자 M이 되는 경우가 몇 번있는지 출력
 */
public class Main {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;

        int left = 0;
        int right = 1;
        int sum = arr[left] + arr[right];
        right++;

        while (left < n && right < n) {
            sum += arr[right];

            if(sum < m) {
                right++;
            }
            else if (sum > m) {
                sum = sum - arr[right] - arr[left++];
            } else {
                sum = sum - arr[left++] - arr[right];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(main.solution(n, m, arr));
    }
}

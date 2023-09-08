package Ch03.ch03_05;

import java.util.Scanner;

/**
 * 연속된 자연수의 합
 * 양의 정수 N이 입력되면
 * 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수 출력
 */
public class Main {
    public int solution (int n) {
        int answer = 0;

        int len = n / 2 + 1;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = i + 1;
        }

        int left = 0;
        int right = 1;
        int sum = arr[left] + arr[right++];

        while (left < len && right < len) {
            sum += arr[right];

            if (sum < n) right++;
            else if (sum > n) {
                sum = sum - arr[left++] - arr[right];
            } else {
                answer++;
                sum = sum - arr[left++] - arr[right];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(main.solution(n));
    }
}

package Ch03.ch03_04;

import java.util.Scanner;

public class Main2 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;

        int left = 0;
        int sum = 0;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            if (sum == m) answer++;

            while (sum >= m) {
                sum -= arr[left++];
                if (sum == m) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main2 main = new Main2();
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

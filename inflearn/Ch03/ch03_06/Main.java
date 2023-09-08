package Ch03.ch03_06;

import java.util.Scanner;

/**
 * 최대 길이 연속부분수열
 * 0과 1로 구성된 길이가 N인 수열이 주어진다.
 * 이 수열에서 최대 K번을 0을 1로 변경할 수 있다.
 * 최대 K번의 변경을 통해 이 수열에서 1로만 구성된 최대길이의 연속부분 수열을 찾기
 */
public class Main {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;

        int left = 0;
        int right = 0;

        while (left < n && right < n) {
            if (arr[right] == 1) {
                right++;
            } else if (arr[right] == 0) {
                int cnt = 1;
                int len = 0;
                while (right < n) {
                    if (arr[right] == 0) {
                        if (cnt < k + 1) {
                            right++;
                            cnt++;
                        } else {
                            break;
                        }
                    } else if (arr[right] == 1) {
                        right++;
                    }
                }
                len = right - left;
                answer = Math.max(len, answer);
                left++;
                right = left;
            }
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

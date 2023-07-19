package Ch02.ch02_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public boolean isPrime(int num) {
        boolean answer = true;

        if (num == 1) {
            answer = false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int result = 0;
            while (num != 0) {
                int digit = num % 10;
                result = result * 10 + digit;
                num /= 10;
            }
            if (isPrime(result)) {
                answer.add(result);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main answer = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : answer.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}

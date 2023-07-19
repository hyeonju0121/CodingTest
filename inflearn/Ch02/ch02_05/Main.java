package Ch02.ch02_05;

import java.util.Scanner;

public class Main {
    public int solution(int n) {
        int answer = 0;

        int[] check = new int[n+1];

        for (int i = 2; i <= n; i++) {
            if (check[i] == 0) {
                answer++;
                for (int j = i; j <= n; j=j+i) {
                    check[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main answer = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(answer.solution(n));
    }
}

package Ch05.ch05_06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public int solution (int n, int k) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i < n + 1; i++) {
            queue.add(i);
        }

        int cnt = 0;
        while (queue.size() != 1) {
            cnt++;
            int prince = queue.peek();

            if (cnt == k) {
                queue.remove(prince);
                cnt = 0;
            } else {
                queue.remove(prince);
                queue.add(prince);
            }
        }

        answer = queue.peek();

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(main.solution(n, k));
    }
}

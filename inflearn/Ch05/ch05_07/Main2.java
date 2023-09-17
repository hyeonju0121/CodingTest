package Ch05.ch05_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {
    public String solution(String subjects, String plans) {
        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();
        for (char c : subjects.toCharArray()) {
            queue.offer(c);
        }

        for (char c : plans.toCharArray()) {
            if (queue.contains(c)) {
                if (c != queue.poll()) return "NO";
            }
        }

        if (!queue.isEmpty()) {
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main2 main = new Main2();
        Scanner sc = new Scanner(System.in);

        String subjects = sc.next();
        String plans = sc.next();
        System.out.println(main.solution(subjects, plans));
    }
}

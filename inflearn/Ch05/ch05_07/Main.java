package Ch05.ch05_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public String solution(String subjects, String plans) {
        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();
        for (char subject : subjects.toCharArray()) {
            queue.add(subject);
        }

        char subject = ' ';
        for (char plan : plans.toCharArray()) {
            if (queue.size() != 0) {
                subject = queue.peek();
            }

            if (queue.size() == 0) {
                return answer;
            }

            if (plan == subject) {
                queue.remove(subject);
            } else {
                if (queue.contains(plan)) {
                    return "NO";
                }
            }
        }

        if (queue.size() != 0) {
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        String subjects = sc.next();
        String plans = sc.next();
        System.out.println(main.solution(subjects, plans));
    }
}

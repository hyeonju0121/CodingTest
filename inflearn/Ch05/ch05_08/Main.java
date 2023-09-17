package Ch05.ch05_08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id;
    int score;

    public Person(int id, int score) {
        this.id = id;
        this.score = score;
    }
}

public class Main {
    public int solution (int n, int m, int[] arr) {
        int answer = 1;

        Queue<Person> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, arr[i]));
        }

        while (!queue.isEmpty()) {
            Person person = queue.poll();

            for (Person x : queue) {
                if (x.score > person.score) {
                    queue.offer(person);
                    person = null;
                    break;
                }
            }

            if (person != null) { // person 이 제일 위험도가 높은 환자
                if (person.id == m) {
                    return answer;
                }
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

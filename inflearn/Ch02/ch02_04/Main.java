package Ch02.ch02_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(0);
        answer.add(1);

        int sum = 0;
        while (true) {
            if (answer.size() == (n + 1)) {
                break;
            }

            int len = answer.size();

            sum = answer.get(len-2) + answer.get(len-1);

            answer.add(sum);
        }
        answer.remove(0);

        return answer;
    }
    public static void main(String[] args) {
        Main answer = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int x : answer.solution(n)) {
            System.out.print(x + " ");
        }
    }
}

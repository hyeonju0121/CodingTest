import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n, int m) {
        ArrayList<Integer> answer = new ArrayList<>();

        int sum = 0;

        boolean[] check = new boolean[m + 1];
        check[0] = true;
        check[1] = true;

        for (int i = 2; i < Math.sqrt(m); i++) {
            if (!check[i]) {
                for (int j = i * 2; j <= m; j += i) {
                    check[j] = true;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int k = 2; k <= m; k++) {
            if (!check[k] && (k >= n)) {
                sum += k;
                list.add(k);
            }
        }

        if (sum == 0) {
            answer.add(-1);
        } else {
            answer.add(sum);
            answer.add(list.get(0));
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i : main.solution(n, m)) {
            System.out.println(i);
        }
    }
}
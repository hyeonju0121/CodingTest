import java.util.*;

public class Main {
    public boolean isPalindrome(int n) {
        String temp = String.valueOf(n);
        String temp2 = new StringBuilder(temp).reverse().toString();

        if (temp.equals(temp2)) return true;
        return false;
    }

    public void solution(int a, int b) {
        StringBuilder sb = new StringBuilder();

        boolean[] isPrime = new boolean[b + 1];

        for (int i = 2; i <= Math.sqrt(b); i++) {
            if(!isPrime[i]) {
                for (int j = i * 2; j <= b; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        for (int i = a; i <= b; i++) {
            if (!isPrime[i] && isPalindrome(i)) {
                sb.append(i).append('\n');
            }
        }
        sb.append(-1);

        System.out.println(sb);
    }

    public static void main(String[] args) {
        Main answer = new Main();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        answer.solution(a, b);
    }
}

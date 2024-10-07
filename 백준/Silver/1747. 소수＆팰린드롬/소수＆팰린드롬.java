import java.util.*;

public class Main {
    // 소수 판정
    public boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 팰린드롬 판정
    public boolean isPalindrome(int n) {

        String temp = String.valueOf(n);
        String temp2 = new StringBuilder(temp).reverse().toString();

        if (temp.equals(temp2)) {
            return true;
        }
        return false;
    }

    public int solution(int n) {
        int answer = 0;
        
        while(true) {
            if (isPrime(n) && isPalindrome(n)) {
                answer = n;
                break;
            }
            n++;
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

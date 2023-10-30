import java.util.Scanner;

public class Solution {
    public int sum(int num) {
        int answer = 0;

        while (num != 0) {
            int digit = num % 10;
            answer += digit;
            num /= 10;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(solution.sum(num));
    }
}
import java.util.Scanner;

public class Solution {
    public int answer(int num) {
        int result = 0;

        for (int i = 1; i <= num; i++) {
            result += i;
        }

        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(solution.answer(num));
    }
}

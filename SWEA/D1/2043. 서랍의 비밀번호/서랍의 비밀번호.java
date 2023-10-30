import java.util.Scanner;

public class Solution {
    public int answer(int p, int k) {
        return p - k + 1;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution.answer(p, k));
    }
}
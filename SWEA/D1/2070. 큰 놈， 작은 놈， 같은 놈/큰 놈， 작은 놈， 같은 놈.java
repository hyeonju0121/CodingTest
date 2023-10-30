import java.util.Scanner;

public class Solution {
    public String answer(int n1, int n2) {
        if (n1 > n2) {
            return ">";
        } else if (n1 == n2) {
            return "=";
        } else {
            return "<";
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            System.out.println("#" + (i+1) + " " + solution.answer(n1, n2));
        }
    }
}
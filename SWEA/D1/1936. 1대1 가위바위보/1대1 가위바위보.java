import java.util.Scanner;

public class Solution {
    public Character answer(int a, int b) {
        if (a == 1 && b == 2) return 'A';
        else if (a == 2 && b == 1) return 'A';
        else if (a == 3 && b == 2) return 'A';
        else return 'B';
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solution.answer(a, b));
    }
}
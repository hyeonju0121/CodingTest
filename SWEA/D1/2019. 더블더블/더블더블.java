import java.util.Scanner;

public class Solution {
    public int[] answer(int num) {
        int[] arr = new int[num + 1];
        arr[0] = 1;

        for (int i = 1; i <= num; i++) {
            arr[i] = (int) Math.pow(2, i);
        }
        return arr;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i : solution.answer(num)) {
            System.out.print(i + " ");
        }
    }
}
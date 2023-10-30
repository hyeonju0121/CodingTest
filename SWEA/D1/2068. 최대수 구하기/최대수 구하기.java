import java.util.Scanner;

public class Solution {
    public int maxArr(int[] arr) {
        int answer = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > answer) {
                answer = i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int[] arr = new int[10];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println("#" + (i+1) + " " + solution.maxArr(arr));
        }
    }
}
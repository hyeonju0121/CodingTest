import java.util.Scanner;

public class Solution {
    public int sum(int num) {
        String temp = String.valueOf(num);
        String[] arr = temp.split("");

        int answer = 0;
        for (String s : arr) {
            answer += Integer.parseInt(s);
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
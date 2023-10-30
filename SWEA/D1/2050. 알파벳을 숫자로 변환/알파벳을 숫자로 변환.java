import java.util.Scanner;

public class Solution {
    public String answer(String str) {
        String[] strArr = str.split("");

        String result = "";
        for (String temp : strArr) {
            int n = (int) temp.charAt(0) - 64;
            result += String.valueOf(n) + " ";
        }
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(solution.answer(str));
    }
}
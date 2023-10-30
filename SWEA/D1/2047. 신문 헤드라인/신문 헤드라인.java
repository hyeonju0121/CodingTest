import java.util.Scanner;

public class Solution {
    public String UpperString(String str) {
        String[] arr = str.split("_");

        String temp = "";
        for (String origin : arr) {
            for (char c : origin.toCharArray()) {
                temp += Character.toUpperCase(c);
            }
            temp += "_";
        }

        return temp.substring(0, temp.length() - 1);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(solution.UpperString(str));
    }
}
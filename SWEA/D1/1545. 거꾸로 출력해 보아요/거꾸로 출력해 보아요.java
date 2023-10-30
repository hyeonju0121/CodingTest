import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public ArrayList<Integer> answer(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = num; i >= 0; i--) {
            list.add(i);
        }
        return list;
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
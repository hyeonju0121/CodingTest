import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public int answer(int[] arr) {
        int result = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int score : arr) {
            map.put(score, map.getOrDefault(score, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (int key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                result = key;
            } else if (map.get(key) == max) {
                if (key > result) {
                    result = key;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int testCase = sc.nextInt();
            int[] arr = new int[1000];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println("#" + i + " " + solution.answer(arr));
        }
    }
}
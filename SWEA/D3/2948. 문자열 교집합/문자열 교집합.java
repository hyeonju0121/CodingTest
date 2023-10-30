import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public int answer(String[] nArr, String[] mArr) {
        int result = 0;

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for (String str : nArr) {
            map1.put(str, map1.getOrDefault(str, 0) + 1);
        }
        for (String str : mArr) {
            map2.put(str, map2.getOrDefault(str, 0) + 1);
        }

        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) result++;
        }
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String[] nArr = new String[n];
            String[] mArr = new String[m];

            for (int j = 0; j < n; j++) {
                nArr[j] = sc.next();
            }
            for (int k = 0; k < m; k++) {
                mArr[k] = sc.next();
            }

            System.out.println("#" + i + " " + solution.answer(nArr, mArr));
        }
    }
}
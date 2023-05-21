import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            map.put(i, 0);
        }
        
        int min = Integer.MAX_VALUE;
        for (int key : map.keySet()) {
            int temp = n - key;
                        
            if (key > n) {
                temp *= -1;
            }

            if (temp < min) {
                min = temp;
                answer = key;
            }
        }
        
        return answer;
    }
}
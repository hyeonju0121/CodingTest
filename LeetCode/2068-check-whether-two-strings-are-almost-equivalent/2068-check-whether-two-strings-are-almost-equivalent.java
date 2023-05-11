import java.util.*;

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        boolean answer = true;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : word1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : word2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }


        for (char key : map.keySet()) {
            if (!map2.containsKey(key)) {
                map2.put(key, 0);
            }
        }

        for (char key : map2.keySet()) {
            if (!map.containsKey(key)) {
                map.put(key, 0);
            }
        }

        int temp;
        for (char key : map.keySet()) {
            temp = map.get(key) - map2.get(key);
            if (temp < 0) {
                temp *= -1;
            }
            if (temp > 3) {
                answer = false;
                break;
            }
        }

        return answer;
    }
}

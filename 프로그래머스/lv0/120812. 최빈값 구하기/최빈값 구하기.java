import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        int max = 0;
        for (int key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
            }
        }
        
        ArrayList<Integer> check = new ArrayList<>();
        for (int key : map.keySet()) {
            if (max == map.get(key)) {
                check.add(key);
            }
        }
        
        if (check.size() > 1) {
            answer = -1;
        }
        else { answer = check.get(0);}

        return answer;
    }
}
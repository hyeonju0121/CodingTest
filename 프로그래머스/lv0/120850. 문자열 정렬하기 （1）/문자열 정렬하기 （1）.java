import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (char c : my_string.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                arr.add(Integer.parseInt(String.valueOf(c)));
            }
        }

        int[] answer = new int[arr.size()];
        int min = Integer.MAX_VALUE;
        int size = arr.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (min > arr.get(j)) {
                    min = arr.get(j);
                }
            }
            arr.remove(Integer.valueOf(min));
            
            answer[i] = min;
            
            min = Integer.MAX_VALUE;
        }
        
        return answer;
    }
}
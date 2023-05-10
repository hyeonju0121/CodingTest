import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < name.length; i++) {
            String people = name[i];
            int attachment = yearning[i];
            
            map.put(people, attachment);
        }
        
        int sum = 0;
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                sum += map.getOrDefault(photo[i][j], 0);
            }
            answer[i] = sum;
            sum = 0;
        }
        
        return answer;
    }
}
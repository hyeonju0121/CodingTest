import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        HashMap<Integer, Integer> map2 = new HashMap<>();
        
        for (int num : nums2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
        
        ArrayList<Integer> temp = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map2.containsKey(key)) {
                temp.add(key);
            }
        }
        
        int[] answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        
        return answer;   
    }
}
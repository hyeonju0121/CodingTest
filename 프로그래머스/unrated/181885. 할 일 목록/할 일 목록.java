import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> temp = new ArrayList<>();
        
        for (int i = 0; i < todo_list.length; i++) {
            if (finished[i] == false) {
                temp.add(todo_list[i]);
            }
        }
        
        String[] answer = new String[temp.size()];
        
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        
        return answer;
    }
}
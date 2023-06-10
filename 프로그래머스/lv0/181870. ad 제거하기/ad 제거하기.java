import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {

        ArrayList<String> temp = new ArrayList<>();
        
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad")) {
                continue;
            } else {
                temp.add(strArr[i]);
            }
        }
        
        String[] answer = new String[temp.size()];
        
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        
        return answer;
    }
}

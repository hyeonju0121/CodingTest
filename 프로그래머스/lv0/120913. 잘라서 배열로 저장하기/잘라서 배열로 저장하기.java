import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> lst = new ArrayList<>();
           
        int len = my_str.length();
        int num = 0;
        int end = n;
        
        while (true) {
            String temp = "";
            
            if (len <= n) {
                temp = my_str.substring(my_str.length() - len);
                lst.add(temp);
                break;
            }

            for (int i = num; i < end; i++) {
                temp += my_str.charAt(i);
            }
            lst.add(temp);
            
            num += n; 
            end += n; 
            len -= n;
        }
        
        String[] answer = new String[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            answer[i] = lst.get(i);
        }

        return answer;
    }
}
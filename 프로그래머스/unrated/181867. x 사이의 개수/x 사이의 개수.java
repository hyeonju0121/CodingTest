import java.util.*;

class Solution {
    public int[] solution(String myString) {
        
        if (myString.charAt(myString.length() - 1) == 'x') {
            myString += " ";
        }
        
        String[] arr = myString.split("x");
        
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < answer.length; i++) {
            if (arr[i].equals(" ")) {
                answer[i] = 0;
            } else {
                answer[i] = arr[i].length();
            }
        }
        
        return answer;
    }
}
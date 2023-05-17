import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        String[][] data = new String[quiz.length][];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] temp = quiz[i].split(" ");
            data[i] = temp;
        }
        
        int temp = 0;
        for (int i = 0; i < data.length; i++) {
            int a = Integer.parseInt(data[i][0]);
            int b = Integer.parseInt(data[i][2]);

            if (data[i][1].equals("-")) {
                temp = a - b;
            }
            else {
                temp = a + b;
            }
            
            if (temp == Integer.parseInt(data[i][4])) {
                answer[i] = "O";
            }
            else {
                answer[i] = "X";
            }
            
            temp = 0;
        }
        

        return answer;
    }
}
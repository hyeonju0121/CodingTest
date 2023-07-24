import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        
        int[] num = new int[numlist.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = numlist[i] - n;
            if (num[i] < 0) {
                num[i] *= -1;
            }
        }
        
        int[] temp = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            int dis = num.length + 1;
            for (int j = 0; j < num.length; j++) {
                if ((num[i] < num[j]) || (num[i] == num[j])) {
                    dis--;
                } 
            }
            temp[i] = dis;
        }

        
        for (int i = 0; i < temp.length; i++) {
            int idx = temp[i] - 1;
            
            if (answer[idx] > 0) {
                if (answer[idx] < numlist[i]) {
                    int tmp = answer[idx];
                    answer[idx] = numlist[i];
                    answer[idx + 1] = tmp;
                } else {
                    answer[idx + 1] = numlist[i];
                }
            } else {
                answer[idx] = numlist[i];
            }
            
        }
        
        return answer;
    }
}
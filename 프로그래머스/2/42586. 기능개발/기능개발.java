import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        LinkedList<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            
            if (remain % speeds[i] == 0) {
                queue.offer(remain / speeds[i]);
            } else {
                queue.offer(remain / speeds[i] + 1);
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int remain = queue.peek();
        queue.poll();
        int cnt = 1;
        
        while(queue.size() != 0) {
            if (queue.peek() < remain) {
                if (queue.size() == 1) {
                    cnt++;
                    list.add(cnt);
                    queue.poll();
                    break;
                }
                queue.poll();
                cnt++;
                
            } else {
                if (queue.peek() == remain) {
                  cnt++;
                } else {
                    remain = queue.peek();
                    list.add(cnt);
                    cnt = 1;
                }
                
                if (queue.size() == 1) {
                    list.add(cnt);
                    queue.poll();
                    break;
                }
                queue.poll();
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
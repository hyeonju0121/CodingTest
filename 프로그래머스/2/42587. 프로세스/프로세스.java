import java.util.*;

class Process {
    char c = 'A';
    int priority = 0;
    
    @Override
    public String toString() {
        return String.format("[%s, %d]", c, priority);
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        
        LinkedList<Process> queue = new LinkedList<>();
        
        int n = 64;
        for (int i = 0; i < priorities.length; i++) {
            Process pro = new Process();
            
            n += 1;

            pro.c = (char) n;
            pro.priority = priorities[i];
            
            queue.offer(pro);
        }

        ArrayList<Process> list = new ArrayList<>();
        while(list.size() != priorities.length) {
            // 우선순위 높은 프로세스 찾기
            int max = Integer.MIN_VALUE;
            int cnt = queue.size();
            while(cnt != 0) {
                Process pro = queue.peek();
                
                if (pro.priority > max) {
                    max = pro.priority;
                }
                queue.poll();
                queue.offer(pro);
                cnt--;
            }
            
            // 우선순위 높은 프로세스 제거
            cnt = queue.size();
            while (cnt != 0) {
                Process pro = queue.peek();
                
                if (pro.priority == max) {
                    list.add(pro);
                    queue.poll();
                    break;
                } else {
                    queue.poll();
                    queue.offer(pro);
                }
                cnt--;
            }            
        }
        
        char c = (char) (65 + location);
        
        for (Process pro : list) {
            if (pro.c == c) {
                break;
            } else {
                answer++;
            }
        }

        return answer;
    }
}
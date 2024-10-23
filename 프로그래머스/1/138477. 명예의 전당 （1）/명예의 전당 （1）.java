import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        // 명예의 전당의 최하위 점수 발표
        LinkedList<Integer> queue = new LinkedList<>();
        
        int minScore = Integer.MAX_VALUE;
        for (int i = 0; i < score.length; i++) { 
            // 전날 최하위 점수보다 score[i] 가 작은 경우는 큐에 넣지 않음
            if (score[i] > minScore) {
                // 큐 사이즈가 k 와 동일하다면, 최하위 점수 제거 
                if (queue.size() == k) {
                    int removeCnt = k;
                    while (removeCnt != 0) {
                        int tempScore = queue.peek();
                        if (tempScore == minScore) {
                            queue.poll();
                            break; // 하나 지우면 바로 break 처리 -> 중복 제거 방지
                        } else {
                            queue.poll();
                            queue.offer(tempScore);
                        }
                        removeCnt--;
                    }
                    
                    // minScore 초기화
                    minScore = Integer.MAX_VALUE;
                }
            }
            
            if (queue.size() < k) {
                queue.offer(score[i]);
            }
            
            int cnt = queue.size();
            
            // 큐 내에 최하위 점수 찾기
            while (cnt != 0) {
                int tempScore = queue.peek();
                if (tempScore < minScore) {
                    minScore = tempScore;
                }
                queue.poll();
                queue.offer(tempScore);
                cnt--;
            }
            
            // 최하위 점수를 발표 점수에 추가
            answer[i] = minScore;
        }
        
        return answer;
    }
}
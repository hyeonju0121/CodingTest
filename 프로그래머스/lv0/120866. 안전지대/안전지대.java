class Solution {
    public int solution(int[][] board) {
        int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1};
        int[] dy = {0, 1, -0, -1, 1, 1, -1, -1};
        
        int num = board[0].length;
        int answer = num * num;

        
        for (int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                if (board[i][j] == 1) { // 지뢰인 경우
                    answer--;
                    for(int k = 0; k < 8; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if(nx < 0 || nx >= num || ny < 0 || ny >= num) continue;
                    
                        if(board[nx][ny] == 3) continue;
                        
                        if(board[nx][ny] == 0 ) {
                            board[nx][ny] = 3;
                            answer--;
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}
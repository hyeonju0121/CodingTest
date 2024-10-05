import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        char[] arr = {'N', 'E', 'S', 'W'};
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        
        char[][] map = new char[park.length][];
        boolean check = false;
        for (int i = 0; i < park.length; i++) {
            String temp = park[i];
            map[i] = temp.toCharArray();
            if (!check) {
                for (int j = 0; j < map[i].length; j++) {
                    if (map[i][j] == 'S') {
                        answer[0] = i;
                        answer[1] = j;
                        check = true;
                        break;
                    }
                }
            }
        }
        
        for (int i = 0; i < routes.length; i++) {
            String[] temp = routes[i].split(" ");
            
            for (int j = 0; j < arr.length; j++) {
                if (temp[0].charAt(0) == arr[j]) {
                    int num = Integer.parseInt(temp[1]);
             
                    int x = answer[0];
                    int y = answer[1];
                    
                    for (int k = 0; k < num; k++) {
                        int nx = x + dx[j];
                        int ny = y + dy[j];
  
                        if (nx < 0 || ny < 0 || 
                            nx >= map[0].length || ny >= map[0].length ||
                            map[nx][ny] == 'X') {
                            check = false;
                            break;
                        } else {
                            x = nx;
                            y = ny;
                        }
                    }
                    if (check) {
                        answer[0] = x;
                        answer[1] = y;
                    }
                    check = true;
                }
            }
        }
        
        return answer;
    }
}
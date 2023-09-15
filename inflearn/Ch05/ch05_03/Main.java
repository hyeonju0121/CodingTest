package Ch05.ch05_03;

import java.util.Scanner;
import java.util.Stack;

/**
 * 크레인 인형뽑기 (카카오)
 */
public class Main {
    public int solution (int n, int m, int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < m; i++) {
            int move = moves[i] - 1;
            for (int j = 0; j < n; j++) {
                if (board[j][move] != 0) {
                    if (!stack.isEmpty() && stack.peek() == board[j][move]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][move]);
                    }
                    board[j][move] = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        System.out.println(main.solution(n, m, board, moves));
    }
}

package Ch02.ch02_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 멘토링
 * M 번의 수학 테스트 등수를 가지고 멘토, 멘티 결정
 * EX. 멘토 : A 학생, 멘티 : B 학생 -> A 학생은 M 번의 수학테스트에서 모두 B 학생보다 앞서야 함
 * 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇 가지 인지 출력
 */
public class Main {
    public ArrayList<Integer> check(int m, int[] current, int[][] students) {

        ArrayList<Integer> result = new ArrayList<>();

        if(current.length == 0) {
            return result;
        }

        for (int j = 0; j < current.length; j++) {
            int currentStudent = current[j];
            int cnt = 0;

            for (int k = 1; k < students.length; k++) {
                ArrayList<Integer> list = new ArrayList<>();
                int[] temp = students[k];

                if(temp.length == 0) {
                    return result;
                } else {
                    for (int l = 0; l < temp.length; l++) {
                        list.add(temp[l]);
                    }
                    if (!list.contains(currentStudent)) {
                        break;
                    }
                    if (list.contains(currentStudent)) {
                        cnt++;
                    }
                }
            }
            if (cnt == m-1) {
                result.add(currentStudent);
            }
        }
        return result;
    }
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;

        HashMap<Integer, int[][]> map = new HashMap<>();
        for (int i = 1; i < n + 1; i++) {
            int[][] temp = new int[m][];
            map.put(i, temp);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int currentStudent = arr[i][j]; // 현재 j+1 등인 학생
                int size = n - (j + 1); // 뒤에 몇명에 학생들이 있는 지

                int[] temp = new int[size];
                for (int k = 0; k < size; k++) { // 현재 j+1 등 이후로 학생들 배열에 넣기
                    temp[k] = arr[i][j+1+k];
                }

                int[][] mapValue = map.get(currentStudent);
                mapValue[i] = temp;
            }
        }

        for (int i = 1; i < n + 1; i++) {
            int[][] studentArr = map.get(i);
            ArrayList<Integer> list = check(m, studentArr[0], studentArr);
            answer += list.size();
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(main.solution(n, m, arr));
    }
}

package Ch03.ch03_01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 두 배열 합치기
 * 오름차순 정렬된 두 배열이 주어지면, 두 배열을 오름차순으로 합쳐서 출력
 */
public class Main {
    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        while(p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2]) {
                answer.add(arr1[p1++]);
            } else {
                answer.add(arr2[p2++]);
            }
        }

        while(p1 < n) {
            answer.add(arr1[p1++]);
        }
        while(p2 < m) {
            answer.add(arr2[p2++]);
        }

        return answer;
    }


    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i : main.solution(n, m, arr1, arr2)) {
            System.out.print(i + " ");
        }
    }
}

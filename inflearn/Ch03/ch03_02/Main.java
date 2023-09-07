package Ch03.ch03_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution (int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while (p1 < n && p2 < m) {
            if (arr1[p1] == arr2[p2]) { // 공통원소를 찾은 경우
                answer.add(arr2[p2++]);
                p1++;
            } else { // 공통원소를 못찾은 경우
                if (arr1[p1] > arr2[p2]) p2++;
                else p1++;
            }
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

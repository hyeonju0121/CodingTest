package Ch01.ch01_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main3 {
    public ArrayList<String> solution(int n, String[] arr) {
        ArrayList<String> answer = new ArrayList<>();

//        for (String x : arr) {
//            String temp = new StringBuilder(x).reverse().toString();
//            answer.add(temp);
//        }

        for (String x : arr) {
            char[] s = x.toCharArray(); // [g, o, o, d]

            int lt = 0;
            int rt = x.length() - 1;
            while (lt < rt) {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;

                lt++;
                rt--;
            }
            String temp = String.valueOf(s);
            answer.add(temp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main3 answer = new Main3();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (String s : answer.solution(n, arr)) {
            System.out.println(s);
        }
    }
}

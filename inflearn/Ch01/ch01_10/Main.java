package Ch01.ch01_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public String solution(String str, char t) {
        String answer = "";

        char[] strToCharArr = str.toCharArray();
        ArrayList<Integer> distance = new ArrayList<>();

        int dis = 0;
        int copyDis = 1000;

        for (int i = 0; i < strToCharArr.length; i++) {
            for (int j = 0; j < strToCharArr.length; j++) {
                char check = strToCharArr[j];
                if (check == t) {
                    dis = j - i;

                    if (dis < 0) {
                        dis *= -1;
                    }

                    if (dis < copyDis) {
                        copyDis = dis;
                    }
                }
            }
            distance.add(copyDis);

            copyDis = 1000;
        }

        for (int n : distance) {
            String temp = Integer.toString(n) + " ";
            answer+= temp;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main answer = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");

        String s = arr[0];
        char t = arr[1].charAt(0);

        System.out.println(answer.solution(s, t));
    }
}

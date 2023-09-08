package Ch04.ch04_02;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 아나그램
 * 두 문자열이 알파벳의 나열 순서는 다르지만 구성이 일치하면 두 단어는 아나그램이다.
 */
public class Main {
    public String solution(String str1, String str2) {
        String answer = "YES";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for (char key : map1.keySet()) {
            if (!map2.containsKey(key) || (map2.get(key) != map1.get(key))) {
                answer = "NO";
                return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(main.solution(str1, str2));
    }
}

package Ch04.ch04_02;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 아나그램
 * 두 문자열이 알파벳의 나열 순서는 다르지만 구성이 일치하면 두 단어는 아나그램이다.
 */
public class Main2 {
    public String solution(String str1, String str2) {
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 키가 포함되어 있지 않거나, 해당 키의 값이 이미 0인 경우 바로 return
        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return "NO";
            }
            map.put(c, map.get(c) - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2 main = new Main2();
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(main.solution(str1, str2));
    }
}

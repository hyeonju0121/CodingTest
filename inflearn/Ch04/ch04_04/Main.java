package Ch04.ch04_04;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 모든 아나그램 찾기
 * S단어에서 T문자열과 아나그램이 되는 부분문자열의 개수 출력
 * 아나그램 판별시 대소문자 구분
 * 부분문자열은 연속된 문자열이여야 함
 */
public class Main {
    public boolean check(HashMap<Character, Integer> mapT, HashMap<Character, Integer> mapS) {
        boolean answer = true;
        for (char c : mapS.keySet()) {
            if (!mapT.containsKey(c) || (mapT.get(c) != mapS.get(c))) {
                answer = false;
                break;
            }
        }
        return answer;
    }
    public int solution (String str1, String str2) {
        int answer = 0;

        HashMap<Character, Integer> mapT = new HashMap<>();
        for (char c : str2.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> mapS = new HashMap<>();
        for (int i = 0; i < str2.length(); i++) {
            mapS.put(str1.charAt(i), mapS.getOrDefault(str1.charAt(i), 0) + 1);
        }

        if(check(mapT, mapS)) answer++;


        int left = 0;
        for (int i = str2.length(); i < str1.length(); i++) {
            mapS.put(str1.charAt(left), mapS.get(str1.charAt(left)) - 1);
            if (mapS.get(str1.charAt(left)) == 0) {
                mapS.remove(str1.charAt(left));
            }
            mapS.put(str1.charAt(i), mapS.getOrDefault(str1.charAt(i), 0) + 1);

            left++;

            if (check(mapT, mapS)) answer++;
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

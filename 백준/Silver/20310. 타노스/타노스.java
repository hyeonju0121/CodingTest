import java.util.*;

public class Main {
    public String solution(String str) {
        String answer = "";

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char key : map.keySet()) {
            if(key == '0' || key == '1') {
                map.put(key, map.getOrDefault(key, 0) / 2);
            }
        }

        for (char key : map.keySet()) {
            int num = map.get(key);
            for (int i = 0; i < num; i++) {
                answer += key;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(main.solution(str));

    }
}
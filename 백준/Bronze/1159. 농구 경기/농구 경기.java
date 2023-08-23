import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public String solution(String[] str) {
        String answer = "";

        HashMap<Character, Integer> map = new HashMap<>();

        for (String s : str) {
            char c = s.charAt(0);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char key : map.keySet()) {
            if (map.get(key) >= 5) {
                answer += key;
            }
        }

        if (answer.length() == 0) {
            answer = "PREDAJA";
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println(main.solution(arr));
    }
}
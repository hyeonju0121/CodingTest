import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "1";

        int len = str.length() / 2;
        int endIdx = str.length() - 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != str.charAt(endIdx)) {
                answer = "0";
                return answer;
            }
            endIdx--;
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
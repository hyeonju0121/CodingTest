import java.util.*;

public class Main {
    public String[] solution(int n, String[] arr) {
        ArrayList<String> temp = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (String str : arr) {
            String[] info = str.split(" ");

            map.put(info[0], map.getOrDefault(info[0], 0) + 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) % 2 != 0) {
                temp.add(key);
            }
        }

        String[] answer = new String[temp.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = temp.get(i);
        }

        Arrays.sort(answer, Collections.reverseOrder());

        return answer;
    }


    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        for (String name : main.solution(n, arr)) {
            System.out.println(name);
        }
    }
}

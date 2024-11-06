import java.util.*;

public class Main {
    public void solution(int[] sequence) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int n : sequence) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            if (!list.contains(n)) {
                list.add(n);
            }
        }

        while(map.size() != 0) {
            int maxValue = Integer.MIN_VALUE;
            for (int key : map.keySet()) {
                if (map.get(key) > maxValue) {
                    maxValue = map.get(key);
                }
            }

            for (int n : list) {
                if (map.get(n) == maxValue) {
                    for (int i = 0; i < maxValue; i++) {
                        System.out.print(n + " ");
                    }
                    map.remove(n);
                    list.remove(Integer.valueOf(n));
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();

        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
        }
        main.solution(sequence);
    }
}

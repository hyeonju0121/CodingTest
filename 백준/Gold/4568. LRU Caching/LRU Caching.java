import java.util.*;

public class Main {
    public boolean isExist(ArrayList<Character> list, char current) {
        for (char c : list) {
            if (c == current) {
                return true;
            }
        }
        return false;
    }

    public void print(ArrayList<Character> list) {
        for (char cache : list) {
            System.out.print(cache);
        }
        System.out.println();
    }

    public void solution(int n, String text) {
        Stack<Character> stack = new Stack<>();
        stack.push(text.charAt(0));
        char[] process = text.toCharArray();

        for (int i = 1; i < process.length; i++) {
            char current = process[i];
            boolean check = isExist(new ArrayList<>(stack), current);

            if (current == '!') {
                print(new ArrayList<>(stack));
            } else {
                // cache hit
                if (check) {
                    ArrayList<Character> tempList = new ArrayList<>();

                    while (current != stack.peek()) {
                        tempList.add(stack.pop());
                    }
                    stack.pop();

                    for (int j = tempList.size() - 1; j >= 0; j--) {
                        stack.push(tempList.get(j));
                    }
                    stack.push(current);
                } else { // cache miss
                    if (stack.size() == n) {
                        ArrayList<Character> tempList = new ArrayList<>();
                        while(!stack.isEmpty()) {
                            tempList.add(stack.pop());
                        }
                        for (int j = tempList.size() - 2; j >= 0; j--) {
                            stack.push(tempList.get(j));
                        }
                    }
                    stack.push(current);
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int idx = 1;
        while(true) {
            int n = sc.nextInt();
            if (n == 0) break;

            String text = sc.next();

            System.out.println("Simulation " + idx);
            main.solution(n, text);
            idx++;
        }
    }
}

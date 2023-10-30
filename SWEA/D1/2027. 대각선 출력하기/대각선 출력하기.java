public class Solution {
    public static void main(String[] args) {
        String[] arr = {"+", "+", "+", "+", "+"};

        for (int i = 0; i < 5; i++) {
            arr[i] = "#";
            System.out.println(String.join("", arr));
            arr[i] = "+";
        }
    }
}
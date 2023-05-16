class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] strArr = my_string.split("");
        char[] arr = my_string.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            String temp = strArr[i];
            if (Character.isUpperCase(arr[i])) {
                temp = temp.toLowerCase();
                answer += temp;
            }
            else {
                temp = temp.toUpperCase();
                temp.toUpperCase();
                answer += temp;
            }
        }
        
        return answer;
    }
}
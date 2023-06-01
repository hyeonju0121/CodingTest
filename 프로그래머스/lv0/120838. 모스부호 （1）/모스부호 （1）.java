import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = letter.split(" ");
        
        String[] morseKey = { ".-", "-...", "-.-.", "-..", ".", "..-.",
                             "--.", "....", "..", ".---", "-.-", ".-..",
                             "--", "-.", "---", ".--.", "--.-", ".-.",
                             "...", "-", "..-", "...-",".--", "-..-",
                             "-.--", "--.."};
        String[] morseValue = {"a", "b", "c", "d", "e", "f",
                              "g", "h", "i", "j", "k", "l",
                              "m", "n", "o", "p", "q", "r",
                              "s", "t", "u", "v", "w", "x", "y", "z"};
        
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i < morseKey.length; i++) {
            map.put(morseKey[i], morseValue[i]);
        }
        
        for (int i = 0; i < morse.length; i++) {
            if (map.containsKey(morse[i])) {
                answer += map.get(morse[i]);
            }
        }

        return answer;
    }
}
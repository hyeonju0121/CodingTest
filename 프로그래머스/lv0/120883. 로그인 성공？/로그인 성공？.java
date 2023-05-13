import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        HashMap<String, String> id_pw_map = new HashMap<>();
        id_pw_map.put(id_pw[0], id_pw[1]);
        
        HashMap<String, String> db_map = new HashMap<>();
        for (int i = 0; i < db.length; i++) {
            for (int j = 1; j < 2; j++) {
                db_map.put(db[i][j-1], db[i][j]);
            }
        }
        
        for (String key : id_pw_map.keySet()) {
            if (db_map.containsKey(key)) {
                if (id_pw_map.get(key).equals(db_map.get(key))) {
                    answer = "login";
                }
                else {
                    answer = "wrong pw";
                }
            }
            else {
                answer = "fail";
            }
        }

        return answer;
    }
}
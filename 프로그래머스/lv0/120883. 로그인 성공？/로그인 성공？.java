import java.util.*;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        HashMap<String, String> hm = new HashMap();
        
        for(int i = 0; i<db.length; i++){
            for(int j = 0; j<db[i].length; j++){  
                hm.put(db[i][0], db[i][1]);   
            }
        }

        
        
        if(hm.containsKey(id_pw[0])){
            System.out.println(hm.get(id_pw[0]));
            System.out.println(id_pw[1]);
            
            if(hm.get(id_pw[0]).equals(id_pw[1])){
                return "login";
            }
            
            return "wrong pw";
        }
      
        return "fail";
    }
}
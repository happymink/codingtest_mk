import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap();
        
        for(String x : participant){
            hm.put(x, hm.getOrDefault(x, 0)+1);
        }
        
        for(String x : completion){
            hm.put(x, hm.get(x)-1);
        }

        for(String x : participant){
            if(hm.get(x) != 0){
                return x;
            }
        }
 
        return answer;
    }
}
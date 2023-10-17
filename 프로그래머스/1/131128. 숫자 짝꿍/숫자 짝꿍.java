import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "-1";
        ArrayList<Character> ary = new ArrayList();
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> hm = new HashMap();
        for(char c : X.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }
        long count = 0;
        
        for(char c : Y.toCharArray()){
            if(hm.containsKey(c)){
                ary.add(c);
                if(hm.get(c) == 1){
                    hm.remove(c);
                } else hm.put(c, hm.get(c)-1);
                count++;
            }
        }
        
        Collections.sort(ary);
        for(int i = 0; i<ary.size(); i++){
            sb.append(ary.get(i));
        }
                
        if(count == 0){
            return "-1";
        }
        
        answer = sb.reverse().toString();
        int n = 0;
        for(char c : answer.toCharArray()){
            if(c == '0'){
                n++;
            }
        }
        if(n == answer.length()){
            return "0";
        }
        
        
        return answer;
    }
}
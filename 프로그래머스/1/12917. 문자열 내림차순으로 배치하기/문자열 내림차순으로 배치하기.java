import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<Character> ary = new ArrayList();
        
        for(char c : s.toCharArray()){
            ary.add(c);
        }
        Collections.sort(ary);
        StringBuilder sb = new StringBuilder();
        for(int i = ary.size()-1; i>=0; i--){
            sb.append(ary.get(i));
        }
        
        return sb.toString();
    }
}
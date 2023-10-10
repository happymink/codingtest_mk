import java.util.*;
class Solution {
    public long solution(long n) {
  
        ArrayList<Character> ary = new ArrayList();
        
        String a = String.valueOf(n);
        for(Character c : a.toCharArray()){
            ary.add(c);
        }
        Collections.sort(ary, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<ary.size(); i++){
            sb.append(ary.get(i));
        }
        long answer = Long.parseLong(sb.toString());
        return answer;
    }
}
import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] ary = s.toCharArray();
        ArrayList<Character> Alist = new ArrayList();
        HashMap<Character, Integer> hm = new HashMap();
        
        for(char x : ary){
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        for(char x : ary){
            if(hm.get(x) == 1){
                Alist.add(x);
            }
        }
        Collections.sort(Alist);
        for(int i = 0; i<Alist.size(); i++){
            sb.append(Alist.get(i));
        }
        return sb.toString();
    }
}
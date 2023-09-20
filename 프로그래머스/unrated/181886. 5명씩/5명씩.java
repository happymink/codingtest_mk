import java.util.*;
class Solution {
    public String[] solution(String[] names) {
  
        ArrayList<String> ary = new ArrayList();

        for(int i = 0; i<names.length; i+=5){
              ary.add(names[i]);
        }
        String[] answer = new String[ary.size()];
        for(int i = 0; i<ary.size(); i++){
            answer[i] = ary.get(i);
        }
        return answer;
    }
}
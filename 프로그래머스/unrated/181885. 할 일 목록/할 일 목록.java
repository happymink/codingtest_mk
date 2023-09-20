import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> arylist = new ArrayList();
       
        int n = finished.length;
        for(int i = 0; i<n; i++){
            if(finished[i] == false){
                arylist.add(todo_list[i]);
            }
        }
        String[] answer = new String[arylist.size()];
        for(int i = 0; i<arylist.size(); i++){
            answer[i] = arylist.get(i);
        }
        return answer;
    }
}
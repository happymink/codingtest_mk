import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
         int[] answer = new int[photo.length];

        HashMap<String, Integer> hm = new HashMap();
        
        for(int i = 0; i<photo.length; i++){
            
            for(int j = 0; j<photo[i].length; j++){
                hm.put(photo[i][j], hm.getOrDefault(photo[i][j], 0)+1);
            }
            
            for(int k = 0; k<name.length; k++){
                 if(hm.containsKey(name[k])){
                    answer[i] += hm.get(name[k]) * yearning[k]; 
                }
            }
                hm.clear();
            

        }

        return answer;
    }
}
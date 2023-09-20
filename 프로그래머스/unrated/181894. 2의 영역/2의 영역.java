import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
    
        ArrayList<Integer> arrlist = new ArrayList();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 2){
                arrlist.add(i);
            }
        }
        if(arrlist.isEmpty()){
            int[] noelem = {-1};
            return noelem;
        }
        int min = Collections.min(arrlist);
        int max = Collections.max(arrlist);
        
        int[] answer = new int[max-min+1];
        int index = 0;
        for(int i = min; i<=max; i++){
            answer[index++] = arr[i];
        }
        return answer;
    }
}
import java.util.*;
class Solution {
    
    public int[] solution(int[] arr) {
        ArrayList<Integer>ary = new ArrayList();
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i]; j++){
                ary.add(arr[i]);
            }
        }
                int[] answer = new int[ary.size()];
        for(int i = 0; i<ary.size(); i++){
            answer[i] = ary.get(i);
        }
        return answer;
    }
}
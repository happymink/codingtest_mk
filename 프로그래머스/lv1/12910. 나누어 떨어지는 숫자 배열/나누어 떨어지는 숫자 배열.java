import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                list.add(arr[i]);
                count++;
            }
        }
        if(count == 0){
            return new int[]{-1};
        }
        int[] answer = new int[list.size()];
        Collections.sort(list);
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
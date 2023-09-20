import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> arry = new ArrayList();

        for(int i = 0; i<intervals.length; i++){
            int n = intervals[i][0];
            int m = intervals[i][1];
            for(int j = n; j<=m; j++){
                arry.add(arr[j]);
            }
        }
        int[] answer = new int[arry.size()];
        for(int i = 0; i<arry.size(); i++){
            answer[i] = arry.get(i);
        }
        
        return answer;
    }
}
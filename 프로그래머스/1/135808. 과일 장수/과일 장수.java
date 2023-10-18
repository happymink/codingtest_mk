import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        ArrayList<Integer> ary = new ArrayList();
        
        for(int i = 0; i<score.length; i++){
            ary.add(score[i]);
        }
        
        Collections.sort(ary,Collections.reverseOrder());
        int n = score.length / m;


        int index = m-1;
        for(int i = 0; i<n; i++){
            answer += ary.get(index) * m;
            index += m;
        }
    
        return answer;
    }
}
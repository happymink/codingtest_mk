class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int resultA = 1;
        int resultB = 0;
        
        for(int i  = 0; i<num_list.length; i++){
            resultA *= (num_list[i]);
            resultB += num_list[i];
        }
        if(resultA<resultB*resultB){
            answer = 1;
        } else answer = 0;
        return answer;
    }
}
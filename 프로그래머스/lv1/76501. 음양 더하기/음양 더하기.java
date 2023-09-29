class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int n = absolutes.length;
        for(int i = 0; i<n; i++){
            if(!signs[i]){
                absolutes[i] = absolutes[i] * -1;
            }
        }
        for(int i = 0; i<n; i++){
            answer += absolutes[i];
        }
        return answer;
    }
}
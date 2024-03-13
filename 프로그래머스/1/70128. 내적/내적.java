class Solution {
    public int solution(int[] a, int[] b) {
        int index = a.length;
        int answer = 0;
        
        for(int i = 0; i<index; i++){
            answer += a[i] * b[i];
        }
        
        return answer;
    }
}
class Solution {
    public int[] solution(int[] array) {
        int[] answer = {0,0};
        int index = 0;
        int max = array[0];
        for(int i = 0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
                index = i;
            }
        }
        answer[0] = array[index];
        answer[1] = index;
        return answer;
    }
}
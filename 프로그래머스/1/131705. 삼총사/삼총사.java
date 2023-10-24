class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for(int i = 0; i<number.length; i++){
            int result = number[i];
            for(int j = i+1; j<number.length; j++){
                result += number[j];
                for(int k = j+1; k<number.length; k++){
                    result += number[k];
                    if(result == 0){
                        answer++;
                        result -= number[k];
                        continue;
                    }
                    result -= number[k];
                }
                result -= number[j];
            }
        }
        return answer;
    }
}
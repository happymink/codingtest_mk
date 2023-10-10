import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String word : babbling){
            
            if(word.contains("ayaaya") || word.contains("yeye") || word.contains("woowoo") || word.contains("mama")){
                continue;
            }
            
            word = word.replace("aya", " ");
            word = word.replace("ye", " ");
            word = word.replace("woo", " ");
            word = word.replace("ma", " ");
            word = word.replace(" ", "");
            
            
            if(word.length() == 0) answer++;
        }
        
        return answer;
    }
}
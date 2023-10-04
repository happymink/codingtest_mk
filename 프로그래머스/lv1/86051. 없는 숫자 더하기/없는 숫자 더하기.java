import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i< numbers.length; i++){
            int n = numbers[i];
            hm.put(n ,hm.getOrDefault(n, 0)+1);
        }
        int result = 0;
        for(int i = 1; i<10; i++){
            if(!hm.containsKey(i)){
                result += i;
            }
        }
        return result;
    }
}
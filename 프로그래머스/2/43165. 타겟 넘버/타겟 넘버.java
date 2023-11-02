import java.util.*;
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList();
        Q.offer(0);

        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i<len; i++){
                int num = Q.poll();
            
                if(L == numbers.length && num == target){
                    answer++;
                }
                if(L>=numbers.length){
                        continue;
                    }
                    Q.offer(num + numbers[L]);
                    Q.offer(num - numbers[L]);
            }
            L++;
        }
        return answer;
    }
}
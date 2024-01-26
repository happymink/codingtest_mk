class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        long totalprice = 0;
        
        for(int i = 1; i<=count; i++){
            totalprice += price*i;
        }
        
        if(totalprice<=money){
            return 0;
        }
        
        answer = totalprice - money;
        
        return answer;
    }
}
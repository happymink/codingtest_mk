class Solution {
    public int[] solution(String my_string) {
        char[] ary = my_string.toCharArray();
        int[] answer = new int[52];

        for(char x : ary){ 
            int index = func(x);
            answer[index]++;
        }
        
        return answer;
    }
    
    int func(char x){
        if(x >= 'a'){
            return (x-71);
        }
        return (x-65);
    }
}
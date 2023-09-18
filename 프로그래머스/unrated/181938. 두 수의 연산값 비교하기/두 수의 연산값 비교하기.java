class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(a));
        sb.append(Integer.toString(b));
        int ab = Integer.parseInt(sb.toString());
        
        if(ab > 2*a*b){
            answer = ab;
        } else answer = 2*a*b;
        
        return answer;
    }
}
class Solution {
    public String solution(String s) {
        String answer = "";
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        if(n%2 == 0){
            sb.append(s.charAt((n-1)/2));
            sb.append(s.charAt((n-1)/2+1));
        } else {
            sb.append(s.charAt((n-1)/2));
        }
        answer = sb.toString();
        return answer;
    }
}
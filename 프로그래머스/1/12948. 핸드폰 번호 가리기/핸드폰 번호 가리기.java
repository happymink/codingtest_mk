class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int n = phone_number.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<n-4; i++){
            sb.append("*");
        }
        for(int i = n-4; i < n ; i++){
            sb.append(phone_number.charAt(i));
        }
        
        return sb.toString();
    }
}
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int n = s.length();
        char a = 'a'; // 0 48  0 ~ 9 = 48~57
        System.out.println((int)a);
        if(!(n == 4 ||  n== 6)){
            return false;
        }
        
        for(char x : s.toCharArray()){
           if(!(x >=48 && x <= 57)){
               answer = false;
               return answer;
           }
        }
        return answer;
    }
}
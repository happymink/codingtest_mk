class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<my_strings.length; i++){
            int n = parts[i][0];
            int m = parts[i][1];
            char[] a = my_strings[i].toCharArray();
            for(int j = n; j<=m; j++){
    
                sb.append(a[j]);
            }
        }
        return sb.toString();
    }
}
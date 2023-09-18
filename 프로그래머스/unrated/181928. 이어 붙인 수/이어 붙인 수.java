class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0){
                sb.append(Integer.toString(num_list[i]));
                }
        } int even = Integer.parseInt(sb.toString());
        sb = new StringBuilder();
         for(int i = 0; i<num_list.length; i++){
            if(num_list[i] % 2 == 1){
                sb.append(Integer.toString(num_list[i]));
                 }
        } int odd = Integer.parseInt(sb.toString());
            
        return even+odd;
       
    }
}
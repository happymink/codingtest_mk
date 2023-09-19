class Solution {
    public int[] solution(int[] arr, int[][] queries) {
      
        
        for(int i = 0; i<queries.length; i++){
            int n = queries[i][0];
            int m = queries[i][1];
            int k = queries[i][2];
            for(int j = n; j<=m; j++){
                if(j % k == 0){
                    arr[j]++;
                }
            }
        }
        return arr;
    }
}
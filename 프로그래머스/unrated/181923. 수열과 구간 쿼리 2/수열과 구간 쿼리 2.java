class Solution {
public int[] solution(int[] arr, int[][] queries) {
int[] answer = new int[queries.length]; for(int i = 0; i < answer.length; i++){
answer[i] = 1000000;
for(int j = queries[i][0]; j <= queries[i][1]; j++){
if(arr[j] > queries[i][2] && arr[j] < answer[i]) answer[i] = arr[j]; }
if(answer[i] == 1000000) answer[i] = -1; }
return answer; }
}
import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        ArrayList<Integer> ary = new ArrayList();
        int answer = 0;
        int index = 0;
        int num = 10000;
        
        for(int i = 0; i<array.length; i++){
            if(Math.abs(n - array[i]) <= num){
                num = Math.abs(n - array[i]);
            }
        }
        
        for(int i = 0; i<array.length; i++){
            if(Math.abs(n - array[i]) == num){
                ary.add(array[i]);
            }
        }
        
        Collections.sort(ary);
        return ary.get(0);
    }
}
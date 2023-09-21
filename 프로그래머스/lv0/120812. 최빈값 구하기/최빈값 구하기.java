import java.util.ArrayList;
class Solution {
    public int solution(int[] array) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int high_num = 0;
        int [] index = new int[1000];
    
        for(int i = 0; i < array.length; i++){
            index[array[i]]++;
        }
        
        for(int i = 0; i < index.length; i++){
            if(index[i] > high_num){
                high_num = index[i];
            }
        }
        
        for(int i = 0; i < index.length; i++){
            if(index[i] == high_num){
                list.add(i);
            }
        }
    
             
        if(list.size() > 1){
            return -1;
        }else return list.get(0);
    }
}
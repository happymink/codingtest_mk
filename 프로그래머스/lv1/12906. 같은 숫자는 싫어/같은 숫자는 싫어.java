import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack();
        ArrayList<Integer> ary = new ArrayList();
        st.push(arr[0]);
        ary.add(arr[0]);
        for(int i = 1; i<arr.length; i++){
            if(arr[i] != st.peek()){
                st.push(arr[i]);  
                ary.add(arr[i]);
            }
        }
        
        int[] answer = new int[st.size()];
        
        for(int i = 0; i<ary.size(); i++){
            answer[i] = ary.get(i);
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        Queue<String> Q = new LinkedList<>();
        ArrayList<String> ary = new ArrayList<>();
        ary.add(begin);
        
        int L = 0;
        Q.offer(begin);
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i<len; i++){
                String str = Q.poll(); 
                for(int j = 0; j<words.length; j++){
                    int count = 0;
                    for (int k = 0; k < str.length(); k++) {
                        if(str.charAt(k) != words[j].charAt(k)) {
                            count++;
                        }
                    }
                    if(count == 1){
                        if(words[j].equals(target)){
                            return L+1;
                        }
                        if(!ary.contains(words[j])){
                            ary.add(words[j]);
                            Q.offer(words[j]);
                        }
                    }
                }
            }
            L++;
        }
        return 0;
    }
}
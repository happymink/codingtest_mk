import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        HashMap<Integer, Integer> hm = new HashMap();
        ArrayList<Integer> ary = new ArrayList();
        for(int i = 0; i<rank.length; i++){
            if(attendance[i] == true){
                hm.put(rank[i], i);
                ary.add(rank[i]);
            }
        }
        Collections.sort(ary);
        int[]num = new int[3];
        for(int i = 0; i<3; i++){
            num[i] = hm.get(ary.get(i));
        }
        answer = 10000*num[0] + 100*num[1] + num[2];

        
        return answer;
    }
}
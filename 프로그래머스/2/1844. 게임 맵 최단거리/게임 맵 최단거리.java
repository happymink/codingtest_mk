import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        Queue<int[]> Q = new LinkedList();
        
        Q.offer(new int[]{0, 0});
        
        int [] dr = {1, 0, -1, 0};
        int [] dc = {0, -1, 0, 1};
        maps[0][0] = 0;
        
        int L = 1;
        int count = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i<len; i++){
                int[] p = Q.poll();
                for(int k = 0; k<4; k++){
                    int nr = p[0] + dr[k];
                    int nc = p[1] + dc[k];
                    if(nr == maps.length-1 && nc == maps[0].length-1 ){
                        return L+1;
                    }
                    if(nr>= 0 && nr <maps.length && nc>=0 && nc <maps[0].length && maps[nr][nc] == 1){
                        maps[nr][nc] = 0;
                        Q.offer(new int[]{nr, nc});
                        continue;
                    }
                }
            }
            L++;
        }
        return -1;
    }
}
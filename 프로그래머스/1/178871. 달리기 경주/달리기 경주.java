import java.util.*;
class Solution {
    
    public String[] solution(String[] players, String[] callings) {
        HashMap<Integer, String> hm = new HashMap();
        HashMap<String, Integer> hm2 = new HashMap();
        

        for(int i = 1; i<=players.length; i++){
            hm.put(i, players[i-1]);
            hm2.put(players[i-1], i);
        }
        
        for(int i = 0; i<callings.length; i++){

            int rank = hm2.get(callings[i]); //4등
            String player = hm.get(rank);    //kai
            String beforeplayer = hm.get(rank-1);
            
            hm.put(rank, beforeplayer);
            hm.put(rank-1, player);
            
            hm2.put(player, rank-1);
            hm2.put(beforeplayer, rank);
            
            }
        
        String [] answer = new String[hm.size()];
        
        for(int i = 0; i<hm.size(); i++){
            answer[i] = hm.get(i+1);
        }
        return answer;
        }
        
    }


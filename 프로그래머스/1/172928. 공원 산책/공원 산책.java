class Solution {

    
    public void printboard(int [][] board){
            for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }    
    
    }
    
    public int func(char x){
        if(x == 'N') return 0;
        if(x == 'E') return 1;
        if(x == 'S') return 2;
        if(x == 'W') return 3;
        
        else throw new RuntimeException();
    }
    
    public int[] solution(String[] park, String[] routes) {
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
      //0 -> N , 1 -> E, 2 -> S, 3-> W
        int x = park.length;
        int y = park[0].length();
        int[][] board = new int[x][y];
        
        int r = 0;
        int c = 0;
        
        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                if(park[i].charAt(j) == 'S'){
                    r = i;
                    c = j;
                    board[i][j] = 0;
                    continue;
                }
                if(park[i].charAt(j) == 'X'){
                    board[i][j] = 1;
                    continue;
                }
                board[i][j] = 0;
            }
        }
        
        printboard(board);

        
        

        for(int i = 0; i<routes.length; i++){
            int op = func(routes[i].charAt(0));
            int n = routes[i].charAt(2) - '0';
            
            int nr ;
            int nc ;
            boolean flag = false;
            
            int tempr = r;
            int tempc = c;
            for(int j = 0; j<n; j++){
                System.out.println(routes[i].charAt(0) +" 방향으로 "+ (j+1) + "번째 이동 시작");
                nr = r + dr[op];
                nc = c + dc[op];
                
                if(nr >= 0 && nr < park.length && nc >= 0 && nc < park[0].length()){
                    if(board[nr][nc] == 0){
                        System.out.println(j+1 + "번째 이동이 유효합니다.");
                        flag = true;
                        r = nr;
                        c = nc;
                        continue;
                    }
                    System.out.println(j+1 + "번째 이동이 유효하지 않습니다.");
                    flag = false;
                    r = tempr;
                    c = tempc;
                    break;
                }
                    System.out.println(j+1 + "번째 이동이 유효하지 않습니다.");                    
                    r = tempr;
                    c = tempc;
                    break;
            }

            
        }
    
        return new int[]{r,c};
    }
}


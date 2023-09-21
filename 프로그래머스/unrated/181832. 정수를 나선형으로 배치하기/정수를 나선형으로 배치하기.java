class Solution {
    public int[][] solution(int n) {
        int[] r = {-1, 0, 1, 0};
        int[] m = {0, 1, 0, -1};
        int[][] answer = new int[n][n];
        int direction = 1; // up -> 0, go rigth = 1; down = 2; go left = 3;
        int x = 0, y = 0;
        int num = 1;
        while(num<=n*n){
            answer[x][y] = num;
            int nextX = x+ r[direction];
            int nextY = y+ m[direction];
            if(nextX >= n || nextX < 0 || nextY >= n || nextY < 0 || answer[nextX][nextY] != 0) {
                    direction = (direction + 1) % 4;
                    nextX = x + r[direction];
                    nextY = y + m[direction];
            }
            x = nextX;
            y = nextY;
            num++;
        }
        
        
        return answer;
    }
}
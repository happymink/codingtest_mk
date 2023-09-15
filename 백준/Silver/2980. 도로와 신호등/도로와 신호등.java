import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();

        int loc = 0;
        int time = 0;

        int[][] ary = new int[N][3];

        for (int i = 0; i < N; i++) {
            ary[i][0] = sc.nextInt();
            ary[i][1] = sc.nextInt();
            ary[i][2] = sc.nextInt();
        }

        while(true){

            for(int i = 0; i<N; i++){
                if(loc == ary[i][0]){
                    time = time + addWaitingTime(time, ary[i][1], ary[i][2]);
                }
            }
            time++;
            loc++;
            if(loc == L){
                break;
            }
        }
        System.out.println(time);
    }

    public static int addWaitingTime(int D, int R, int G){
        int waitingTime = R - (D %(R+G));

        if(waitingTime < 0){
            return 0;
        }
        return waitingTime;
    }
}

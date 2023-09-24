
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int copyN = N;
        int answer = 0;
        int n1 = 0, n2 = 0;
        while(true){ // N = 26 , 68
            n1 = (N/10) + (N%10);  // 8 , 14
            n2 = (N%10)*10 + (n1%10);
            answer++;
            if(n2 == copyN){
                System.out.println(answer);
                break;
            }
            N = n2;
        }

    }
}

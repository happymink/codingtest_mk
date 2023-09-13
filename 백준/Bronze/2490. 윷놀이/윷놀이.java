
import java.util.Scanner;

public class Main {

    public static String check(int count) {
        String answer = "";
        //등 (1)의 개수가 몇개인지  
        switch (count) {
            case 0:
                answer = "D";//윷
                break;
            case 1:
                answer = "C"; //걸
                break;
            case 2:
                answer = "B"; //개
                break;
            case 3:
                answer = "A"; //도
                break;
            case 4:
                answer = "E"; //모
                break;

        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;



        String str = "";
        for(int i = 0; i<3; i++){
            str = sc.nextLine();
            for(int j = 0; j<str.length(); j++){
                if(str.charAt(j) == ' ') continue;
                if(str.charAt(j) == '1'){
                    count++;
                }
            }
            System.out.println(check(count));
            count = 0;
        }
    }
}

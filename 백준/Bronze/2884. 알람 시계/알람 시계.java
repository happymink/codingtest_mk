
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String hour = sc.next();
        String minute = sc.next();
        int h, m;

        h = 60 * Integer.parseInt(hour);
        if (hour == "0") {
            h = 24 * 60;
        }
        m = Integer.parseInt(minute);

        print(h + m - 45);
    }

    public static void print(int total) {

        int h = total / 60;
        int m = total % 60;
        if(m<0){
            h= 23; m+=60;
        }
        System.out.print(h + " " + m);

    }
}

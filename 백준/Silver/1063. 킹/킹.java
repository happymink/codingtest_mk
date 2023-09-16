import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strKing = sc.next();
        String strRock = sc.next();
        int count = sc.nextInt();

        String[] ary = new String[count];
        for(int i = 0; i<count; i++){
            ary[i] = sc.next();
        }

        Rock rock = new Rock();
        rock.x = strRock.charAt(0);
        rock.y = strRock.charAt(1);


        King king = new King();
        king.x = strKing.charAt(0);
        king.y = strKing.charAt(1);



        for(int i = 0; i<count; i++){
            func(rock, king, ary[i]);
        }

        System.out.print((char)(king.x));
        System.out.println((char)(king.y));
        System.out.print((char) (rock.x));
        System.out.print((char) (rock.y));
    }

    static class Rock{
        int x;
        int y;
    }

    static class King{
        int x;
        int y;
    }


    public static void func(Rock rock, King king, String go){
        int[] copyX = new int[2];
        int[] copyY = new int[2];
        copyX[0] = king.x;
        copyX[1] = rock.x;
        copyY[0] = king.y;
        copyY[1] = rock.y;


        int x = 0; int y = 0; //x -> 열(A-H)이움직인다. y -> 행(0-8)이 움직인다.
        switch (go){
            case "B":
                y = -1;
                break;
            case "L":
                x = -1;
                break;
            case "R":
                x = 1;
                break;
            case "RT":
                x = 1;
                y = 1;
                break;
            case "LT":
                x = -1;
                y = 1;
                break;
            case "T":
                y = 1;
                break;
            case "RB":
                x = 1;
                y = -1;
                break;
            case "LB":
                x = -1;
                y = -1;
                break;
        }
        king.x += x;
        king.y += y;

        if(king.x == rock.x && king.y == rock.y){
            rock.x += x;
            rock.y += y;
        }

        boolean a = ((king.x) >= 65) && ((king.x) <= 72);
        boolean b = ((king.y) >= 49) && ((king.y) <= 56);

        boolean c = ((rock.x) >= 65) && ((rock.x) <= 72);
        boolean d = ((rock.y) >= 49) && ((rock.y) <= 56) ;

        if(!(a && b && c && d)){
            king.x = copyX[0];
            rock.x = copyX[1];
            king.y = copyY[0];
            rock.y = copyY[1];

        }
    }
}

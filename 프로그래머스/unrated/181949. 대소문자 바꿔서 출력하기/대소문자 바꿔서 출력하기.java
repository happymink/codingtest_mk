import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int i = 0; i<a.length(); i++){
            char b = a.charAt(i);
            if(b >='a' && b <='z'){
                System.out.print((char)((int)b-32));
            } else{
                System.out.print((char)((int)b+32));
            }
        }
    }
}
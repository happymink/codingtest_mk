import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N1,N2;
        StringTokenizer st = new StringTokenizer(br.readLine());
        N1 = Integer.parseInt(st.nextToken());
        N2 = Integer.parseInt(st.nextToken());

        char[] ary = new char[N1+N2];
        int[] group = new int[N1 + N2];

        String strA = br.readLine();
        String strB = br.readLine();
        String str = strA+strB;
        int second = Integer.parseInt(br.readLine());




        for(int i = 0; i<N1; i++){ // N1 = 3; i = 2
            ary[N1-i-1] = str.charAt(i);
            group[i] = 1;
        }

        for(int i = N1; i<ary.length; i++){
            ary[i] = str.charAt(i);
            group[i] = 2;
        }

        if(second > N1 + N2){
            second = N1+N2-1;
        }

        while(second-- > 0){

            for(int j = 0; j<ary.length-1; j++){
                if(group[j] != 2 && group[j+1] != group[j]){
                    char tmp = ary[j];
                    ary[j] = ary[j+1];
                    ary[j+1] = tmp;

                    int tmp2 = group[j];
                    group[j] = group[j+1];
                    group[j+1] = tmp2;
                    j++;
                }
            }

        }

        for (char c : ary) {
            System.out.print(c);
        }

    }
}

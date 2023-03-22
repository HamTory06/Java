package school.study0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) {
        int min;
        int max;
        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(System.in));
            min = Integer.parseInt(in.readLine());
            max = Integer.parseInt(in.readLine());
            int pn[] = new int[100];
            int n = 0;
            for(int i=min; i <= max; i++){
                for(int j=1; j<i; j++){
                    if(i%j == 0){
                        pn[n++] = i;
                    }
                }
            }
            for(int i=min; i < max; i++){
                System.out.println(pn[i]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

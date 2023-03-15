package school.study0315;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam03 {
    void main() throws IOException {
        int n;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt((in.readLine()));

        int a[][] = new int[n][n];
        //1
        int sum = 0;
        for(int i=0; i<n; i++){
            sum++;
            a[0][i] = sum;
        }
        //2
//        for(int i=0; i<n-1; i++){
//            sum++;
//            a[i][0] = sum;
//        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }
}

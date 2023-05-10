package school.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homework0509 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        int[][] array = new int[num][num];
        int number = 1;
        for(int i=0; i<num; i++){
            array[3][i] = number;
            number++;
        }
        number--;
        for(int i=num-1; i>0; i--){
            array[i][0] = number;
            number++;
        }
        number--;
        for(int i=1; i<num-1; i++){
            array[1][i] = number;
            number++;
        }
        number--;
        for(int i=1; i<2; i++){
            array[num-1][i] = number;
            number++;
        }
        number--;
        for(int i=2; i>1; i--){
            array[2][i] = number;
            number++;
        }
        number--;
        array[1][1] = number++;
        array[2][1] = number;

        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}

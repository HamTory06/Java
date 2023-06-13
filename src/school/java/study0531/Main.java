package school.java.study0531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] array = new int[3];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<3; i++){
            int num = Integer.parseInt(bufferedReader.readLine());
            if(!(num > 1 && num < 1000)){
                System.out.println("다시 입력");
                num = Integer.parseInt(bufferedReader.readLine());
            } else {
                for (int k : array) {
                    if (k == num) {
                        num = Integer.parseInt(bufferedReader.readLine());
                        System.out.println("다시 입력");
                    }
                }
                array[i] = num;
            }
        }

        System.out.println(center(array));
    }

    public static int center(int[] number){
        for(int i=0; i<number.length; i++){
            for(int j=0; j<number.length; j++){
                int temp;
                if(number[i] > number[j]){
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(number));
        return number[1];
    }
}

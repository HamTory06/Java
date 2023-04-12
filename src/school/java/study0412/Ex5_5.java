package school.java.study0412;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Ex5_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num01;

        int num02 = (int) (Math.random()*100) + 1;
        while (true){
            num01 = Integer.parseInt(in.readLine());
            if(num01 == num02)
                break;
            else {
                if(num01 > num02)
                    System.out.println("UP");
                else
                    System.out.println("DOWN");
            }
        }
        System.out.println("랜덤 숫자 : " + num02);
        System.out.println("입력 숫자 : " + num01);
    }
}

package school.study0315;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam01 {
    public void processMethod() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("첫번째 숫자입력 : ");
        int num01 = Integer.parseInt((in.readLine()));

        System.out.print("두번째 숫자입력 : ");
        int num02 = Integer.parseInt((in.readLine()));

        System.out.println(num01+num02);

    } //543 -> 12 -> 3
      //543%100
}

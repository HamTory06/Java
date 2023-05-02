package school.java.study0502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print("첫번째 x좌표 : ");
        double x1 = Integer.parseInt(in.readLine());
        System.out.print("첫번째 y좌표 : ");
        double y1 = Integer.parseInt(in.readLine());

        System.out.print("두번째 x좌표 : ");
        double x2 = Integer.parseInt(in.readLine());
        System.out.print("두번째 y좌표 : ");
        double y2 = Integer.parseInt(in.readLine());

        System.out.print("세번째 x좌표 : ");
        double x3 = Integer.parseInt(in.readLine());
        System.out.print("세번째 y좌표 : ");
        double y3 = Integer.parseInt(in.readLine());



        double num01 = Math.pow(x1-x2, 2);
        double num02 = Math.pow(y1-y2, 2);
        double result = Math.sqrt(num01 + num02);


        //출력 : 두점사이의 거리는 3.14 입니다. (소수점 셋째자리에서 반올림)
    }
}

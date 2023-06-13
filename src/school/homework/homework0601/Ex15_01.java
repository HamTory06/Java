package school.homework.homework0601;

import java.util.Scanner;

public class Ex15_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("2자리의 정수 입력(10~99)>>");

        int num = s.nextInt();

        if(num>9 && num<=99){
            System.out.println("2자리의 정수입니다");
        } else {
            System.out.println("2자리의 정수가 이닙니다");
        }
        s.close();
    }
}

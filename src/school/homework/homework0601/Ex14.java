package school.homework.homework0601;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("원화를 입력하세요(단위:원)>>");
        int num=s.nextInt();
        float dollar = num/1100.0f;
        System.out.println(num+"원은 $"+dollar+"입니다.");
        s.close();
    }
}

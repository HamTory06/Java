package school.homework.homework0601;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("커피메뉴를 선택하시오 ");
        String order = s.next();
        int price;

        /** 코드 작성 */
        price =  switch (order){
            case "에스프레소", "카푸치노", "카페라떼는" -> 3500;
            case "아메리카노" -> 2000;
            default -> 0;
        };

        if (price!=0){
            System.out.print(order+"는"+price+"원입니다");
        }
        s.close();
    }
}

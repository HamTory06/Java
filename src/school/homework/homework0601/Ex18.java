package school.homework.homework0601;

import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("정수 3개를 입력>>");
        int l1=s.nextInt();
        int l2=s.nextInt();
        int l3=s.nextInt();

        if(l1 <= l2 && l2 < l3){
            if(l3 < l1+l2){
                System.out.println("삼각형이 됩니다.");
                System.out.println("max"+" " +l3);
                System.out.println("l2"+" " +l2);
                System.out.println("l1"+" " +l1);
                System.out.println("삼각형이 됩니다.");
            } else {
                System.out.println("삼각형이 안됩니다.");
                System.out.println("l3"+" " +l3);
                System.out.println("l2"+" " +l2);
                System.out.println("l1"+" " +l1);
            }
        } else if(l3 <= l1 && l1 < l2){
            if(l2 < l1+l3){
                System.out.println("삼각형이 됩니다.");
                System.out.println("l3"+" " +l3);
                System.out.println("max"+" " +l2);
                System.out.println("l1"+" " +l1);
            } else {
                System.out.println("삼각형이 안됩니다.");
                System.out.println("l3"+" " +l3);
                System.out.println("l2"+" " +l2);
                System.out.println("l1"+" " +l1);

            }
        } else{
            if(l1 < l2+l3){
                System.out.println("삼각형이 됩니다.");
                System.out.println("l3"+" " +l3);
                System.out.println("l2"+" " +l2);
                System.out.println("max"+" " +l1);
            } else {
                System.out.println("삼각형이 안됩니다.");
                System.out.println("l3"+" " +l3);
                System.out.println("l2"+" " +l2);
                System.out.println("l1"+" " +l1);

            }
        }

        /** 코드 작성 */

        s.close();
    }
}
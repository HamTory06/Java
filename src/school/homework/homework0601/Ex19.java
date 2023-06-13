package school.homework.homework0601;

import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int num=s.nextInt();
        if(num <= 9){
            if(num%3 == 0 && num != 0){
                System.out.println("박수짝");
            }
        } else {
            if((num/10)%3 == 0 && ((num%10)%3 == 0 && num%10 != 0)){
                System.out.println("박수짝짝");
            } else if((num%10)%3 == 0){
                System.out.println("박수짝");
            } else if((num/10)%3 == 0){
                System.out.println("박수짝");
            }
        }
        /** 코드 작성 */
        s.close();
    }
}

package school.homework.homework0601;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("점수를입력하시오:");
        int score = s.nextInt();
        System.out.print("학년을입력하시오:");
        int year = s.nextInt();
        if(year == 4){
            if(score >= 70)
                System.out.println("합격");
            else
                System.out.println("불합격");
        } else {
            if(score >= 60)
                System.out.println("합격");
            else
                System.out.println("불합격");
        }

        s.close();
    }
}

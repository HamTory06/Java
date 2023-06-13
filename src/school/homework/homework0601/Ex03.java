package school.homework.homework0601;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        //char grade;
        Scanner s = new Scanner(System.in);
        System.out.println("점수를입력하세요: ");
        int score = s.nextInt();
        if(score >= 90)
            System.out.println("A");
        else if(score >= 80)
            System.out.println("B");
        else if(score >= 70)
            System.out.println("C");
        else if(score >= 60)
            System.out.println("D");
        else
            System.out.println("F");
        s.close();
    }
}

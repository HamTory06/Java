package school.homework.homework0601;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char grade;
        System.out.println("점수를 입력하시오 :");
        int score = s.nextInt();
        grade = switch (score) {
            case 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90 -> 'A';
            case 89, 88, 87, 86, 85, 84, 83, 82, 81, 80 -> 'B';
            case 79, 78, 77, 76, 75, 74, 73, 72, 71, 70 -> 'C';
            case 69, 68, 67, 66, 65, 64, 63, 62, 61, 60 -> 'D';
            default -> 'F';
        };

        /** 코드 작성 */

        System.out.println("학점은" + grade + "입니다");
        s.close();
    }
}

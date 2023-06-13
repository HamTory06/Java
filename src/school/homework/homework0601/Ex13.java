package school.homework.homework0601;

import java.util.Random;

public class Ex13 {
    public static void main(String[] args) {
        Random random = new Random();
        String RPS = "";

        int Rock_Paper_Scissors = random.nextInt(3);
        if(Rock_Paper_Scissors == 0){
            RPS = "가위";
        } else if(Rock_Paper_Scissors == 1) {
            RPS = "바위";
        } else {
            RPS = "보";
        }

        switch (RPS) {
            case "가위" -> System.out.println(1);
            case "바위" -> System.out.println(2);
            case "보" -> System.out.println(3);
            default -> System.out.println(0);
        }
    }
}

package school.homework.homework0601;

import java.util.Random;

public class Ex11 {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = random.nextInt(2) + 100;
        sum = sum>100 ? 100 : 0;
        System.out.println(sum);
    }
}

package school.homework.homework0601;

import java.util.Random;

public class Ex12 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10);
        System.out.println(n>5?n:5);
    }
}

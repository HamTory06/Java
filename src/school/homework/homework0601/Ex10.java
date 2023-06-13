package school.homework.homework0601;

import java.util.Random;

public class Ex10 {
    static Random random = new Random();

    public static void main(String[] args) {
        int age = random.nextInt(12);
        int c = 1;
        int b = 2;
        //age는 12보다 작거나 같다
        if(age <= 12){

        }

        //age는 b보다 작고 c보다 크다
        if(age < b && age > c){

        }
        //age는 빼기 5는 10과 같다
        if(age-5 == 10){

        }

        //age는 b와 같지 않거나 c와 같다
        if(age != b || age == c){

        }
    }

}

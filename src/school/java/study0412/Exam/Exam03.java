package school.java.study0412.Exam;

public class Exam03 {
    public static void main(String[] args) {
        int a = 3, b = 21;
        for(int i=a; i<=b; i++){
            prime(i);
        }
    }

    public static void prime(int number){
        for(int i=2; i<number; i++){
            if(number%i == 0){
                return;
            }
        }
        System.out.println(number);
    }

}

package school.java.study0404;

public class Exam03 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=20; i++){
            if(i%2 != 0 && i%3 != 0){
                sum+=i;
                System.out.println("i = " +i);
            }
        }
        System.out.println("sum = " +sum);
    }
}
//1,5,7,11,13,17,19,
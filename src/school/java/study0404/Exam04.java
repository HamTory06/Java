package school.java.study0404;

public class Exam04 {
    public static void main(String[] args) {

        int totalSum = 0;
        for(int i=1; i<=10; i++){
            int sum = 0;
            for(int j=1; j<=i; j++){
                sum+=j;
            }
            totalSum+=sum;
        }
        System.out.println("totalSum="+totalSum);
        int sum = 0;
        int sumsum = 0;
        for(int i=1; i<=10; i++){
            sum+=i;
            sumsum+=sum;
        }
        System.out.println("sum="+sumsum);
    }
}

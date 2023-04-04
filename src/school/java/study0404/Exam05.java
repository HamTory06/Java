package school.java.study0404;

public class Exam05 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; ;i++){
            if(i%2==0)
                sum-=i;
            else
                sum+=i;
            if(sum >= 100){
                System.out.println(i);
                break;
            }

        }
    }
}

package school.java.study0412.Exam;

public class Exam04 {
    public static void main(String[] args) {
        int number = 3;
        for(int i=0; i<number*2-1; i++){
            for(int j=0; j<number*2-1; j++){
                System.out.print("*"+'\t');
            }
            System.out.println();
        }
    }
}

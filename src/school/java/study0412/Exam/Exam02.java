package school.java.study0412.Exam;

public class Exam02 {
    public static void main(String[] args) {
        int a = 3,b = 7,sum = 0;
        float c = (float) a/b;
        String d = String.valueOf(c);
        for(int i=0; i<d.length()-4; i++){
            sum+=((int)d.charAt(i+2)-'0');
            System.out.println((int)d.charAt(i+2)-'0');
        }
        System.out.println(sum);
    }
}

package school.java.study0404;

public class Exam02 {
    public static void main(String[] args) {
        char ch = 'c';
        char lowerCase = ch<=90 ? ch+=32 : ch;
        System.out.println("ch: "+ ch);
        System.out.println("ch to lowerCase: "+ lowerCase);
    }
}

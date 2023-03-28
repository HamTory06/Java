package school.java.study0328;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Exam01 e01 = new Exam01();
        Exam02 e02 = new Exam02();
    }
}

class Exam01{
    int ex01 = 10;
}

class Exam02 extends Object{
    Exam02(){
        super();
    }

    {

    }
    static {
        //한번만 불러옴
    }
    int ex02 = 20;

    void aa(){
        int ex02 = 20;
        System.out.println("ex02: "+toString());
    }
}

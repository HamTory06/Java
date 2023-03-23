package school.java.study0322;

public class Exam_41 {
    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        d();
    }

    public static void a() {
        int i = 0;
        while (i <= 10) {
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void b() {
        int x = 11;
        char ch = 'A';
        int year = 400;
        boolean powerOn = false;
        String str = "yes";

        if (x < 10 && x > 20) {
            //true
        }

        if (ch != ' ' || ch != '\t') {
            //true
        }

        if (ch == 'x' || ch == 'X') {
            //true
        }

        if (ch <= '0' && ch >= '9') {
            //true
        }

        if (ch <= 'a' && ch >= 'A') {
            //true
        }

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            //true
        }

        if (!powerOn) {
            //true
        }

        if (str.equals("yes")) {
            //true
        }

    }

    public static void c(){
        char ch = 'A';

        char lowerCase = (ch >= 'A') ? (char) (ch + 32) : ch;



        System.out.println("ch:"+ch); System.out.println("ch to lowerCase:"+lowerCase);
    }

    public static void d(){
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);
        char ch = 'A';
        ch = (char) (ch + 2);
        float f = 3.0f / 2;
        long l = 3000 * 3000 * 3000L;
        float f2 = 0.1f;
        double d = 0.1;
        boolean result = d==f2;

        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+!result);
    }
}


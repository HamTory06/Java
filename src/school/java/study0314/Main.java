package school.java.study0314;


/**
 * 변수 - 상수, 자료형
 * 변수 - 값을 담는 통, 크기, 모양,
 *
 * 정수
 * -->
 * boolean - 1바이트 :
 * char - 1바이트
 * short - 2바이트
 * int - 4바이트
 * long - 8바이트
 *
 * 실수
 * float - 4바이트
 * double - 8바이트
 *
 */
class Main {
    public static void main(String[] args){
        Calculator c1 = new Calculator();
        c1.main();
        char cc1 = 'a';
        int cc2 = cc1;
        System.out.println(cc1+" / "+cc2);
        char cc3 = '1'+'2';
        char cc4 = '1';
        char cc5 = '2';
        System.out.println((int)cc4);
        System.out.println((int)cc5);
        System.out.println((int)(cc3));
    }

    void aa(){
        short a = (short)(5 + 3);

        int c = (int)(a+10);

        int b1 = 10;
        int b2 = 200000000;
        short c1 = (short)(b1 + b2);

        int a1 = 100000000;
        int a2 = 100000000;
//        short b = 100000000 + 100000000;
//        short c2 = a1+a2;

        float f1 = 0.0F;
        float f2 = 0.0f;

        long l1 = (long)(f1+f2);
    }
}

class Calculator{
    void main(){
        int a = 10;
        int b = 5;
        System.out.println(a+"+"+b+"="+add(a,b));
        System.out.println(a+"-"+b+"="+subtraction(a,b));
        System.out.println(a+"*"+b+"="+multiply(a,b));
        System.out.println(a+"/"+b+"="+division(a,b));
    }
    int add(int a,int b){
        return a+b;
    }
    int subtraction(int a,int b){
        return a-b;
    }
    int multiply(int a,int b){
        return a*b;
    }
    int division(int a, int b){
        return a/b;
    }
}



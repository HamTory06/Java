package string;

public class CharString {
    public static void main(String[] args) {

        //JAVA는 Character와 String을 구분한다 Character는 한 글자를 의미하고 String는 여러 개의 문자가 합한 것을 의미한다
        //Character일 경우 '(작은따옴표)로 감싸야하고
        //String일 경우 "(큰따옴표)로 감싸야한다
        System.out.println("Hello World");
        System.out.println('h');

        //Character은 "(큰따옴표)로 감싸도된다.
        //Character도 문자열이 될 수 있기 때문이다.
        //대신 자바에서는 h를 문자열로 정의한다.
        System.out.println("h");


        //문자열을 더 할 수 있다.
        //HelloWorld
        System.out.println("Hello" + "World");

        //이스케이프

        //"를 출력하려면 \"를 적으면 된다.
        System.out.println("egoing said\"Welcome programming world\"");

        //여러 줄의 표시
        // \n 사용하면 엔터처리를 한다.
        System.out.println("egoing said\n\"Welcome programming world\"");

        //문자
        char a; // 2byte
        a = 'a';
    }
}
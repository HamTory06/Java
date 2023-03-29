package school.java.study0329;

/**
 * 클래스 - 설계도
 * 객체 - 설계도를 기반으로 만들어진것 --> 사용하는거
 *
 * 클래스안에
 * - 초기화 블럭, 생성자, 메소드, 변수
 * - 변수 - 지역변수(중괄호 안에 있는놈, params, 제어문), 맵버변수, static 맴버변수
 * - 맴버변수 --> 자료형, 접근제한자,
 * - 메소드 --> 기능 이름은 무조건 소문자로 시작
 * - 리턴값 이름(){}
 *      이름()
 * */
public class main {
    public static void main(String[] args) {
        int numOfApples = 123;
        int sizeOfBucket = 10;
        int numOfBucket = numOfApples%sizeOfBucket == 0 ? numOfApples/sizeOfBucket:numOfApples/sizeOfBucket+1;
        System.out.println("필요한 바구니의 수:" + numOfBucket);
    }
    /** 메소드, 접근제한자, 리턴값, 이름(params { })*/

    public int addFunc(int num01, int num02){
        return 1;
    }

    /** 메소드 오버로딩 - 이름이 같고 매개변수가 다른것.*/

    public int addFunc(int num01, int num02, int num03){
        return 1;
    }



}

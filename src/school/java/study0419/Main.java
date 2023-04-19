package school.java.study0419;
/**
 * static 키워드 - 사용되는 시점에 메모리에 올라감.
 * 맴버 메소드랑, 멤버 변수에다가 붙여 쓴다
 *
 * 언제 생김?
 * 멤버변수(인스턴스 변수) --> 객체 생성할때 마다.
 * static 변수(클래스 변수) --> 객체 생성되기 전 한번.
 *
 * 언제 사라짐?
 * 맴버변수 --> 참조변수가 없을때
 * static 변수 --> 프로그램 종료 --> main() 메소드 종료*/
public class Main {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3,false);
        SutdaCard card2 = new SutdaCard();
        System.out.println(card1.info());
        System.out.println(card2.info());
    }

}

class SutdaCard {

    //카드의 숫자.(1~10사이의 정수)
    int num;
    //광이면 true, 아니면 false
    boolean isKwang;

    public SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    public SutdaCard(){
        this(1, true); //SutdaCard(1, true)를 호출한다.
    }
    String info(){
        if(this.isKwang){
            return this.num + "K";
        } else {
            return String.valueOf(this.num);
        }
    }





}

class Exam01{
    int k = 10;

    static int kk = 20;
}


//class에서 public을 사용하는 이유가 class안에 함수에서 public을 사용해서(안에서는 열어줘도 밖에서 안열어주면 못나감)
public class Main {
    Main(){

    }

    static {

    }

    {

    }

    // public: 공개(페키지를 모든 곳에서 사용 할수 있음(?))
    // static: 정적(객체를 만들지 않아도 실행할수 있다.)
    // void: return 값이 없다
    public static void main(String[] args) {
        //System:
        //out:
        //println: 출력하고 new 라인
        System.out.println("Hello world!");
    }
}
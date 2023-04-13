package school.network.study0413;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        print(b);
        print(c);
    }

    public static void print(IA a){
        a.print();
    }
}

interface IA{
    public void print();
}
class B implements IA {
    @Override
    public void print() {
        System.out.println("B");
    }
}

class C implements IA{

    @Override
    public void print() {
        System.out.println("C");
    }
}
abstract class A{
    abstract void print();

    public void mainPring(){
        print();
    }
}
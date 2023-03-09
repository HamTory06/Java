package operator;

public class RemainerDemo {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(0%a); //0, 0...0
        System.out.println(1%a); //1, 0.333...1
        System.out.println(2%a); //2, 0.666...2
        System.out.println(3%a); //0, 1...0
        System.out.println(4%a); //1, 1.333...1
        System.out.println(5%a); //2, 1.666...2
        System.out.println(6%a); //0, 2...0

    }
}

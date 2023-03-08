package constant;

public class ConstantDemo {
    public static void main(String[] args) {
        double a = 2.2;
        float b = 2.2F;
        long c = 2147483648L;
        byte d = 100;
        short e = 200;

        float f = (float)100.0;
        int g = (int)100.1f; //g에 100만 저장됨 나머지는 삭제(날라감)
    }
}
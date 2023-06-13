package school.java.study0510;

public class Exam01 {
    private static String onlyInt = "";

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + inNumber(str));
        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + inNumber(str));
        inNumber1(str);
        System.out.println("숫자만" + onlyInt);
    }

    static boolean inNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 48 || str.charAt(i) > 57) {
                return false;
            }
        }
        return true;
    }

    static boolean inNumber1(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 48 || str.charAt(i) > 57) {

            } else {
                inOnlyInt(String.valueOf(str.charAt(i)));
            }
        }
        return true;
    }

    static String inOnlyInt(String str) {
        onlyInt += str;
        return onlyInt;
    }
}

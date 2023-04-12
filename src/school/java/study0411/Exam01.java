package school.java.study0411;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam01 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


        String value = in.readLine();
        char ch = ' ';
        int A = 0;
        int a = 0;
        int number = 0;

        char[] arrA = new char[100];
        char[] arra = new char[100];
        int[] arrNumber = new int[100];
        boolean isNumber = true;
        for(int i=0; i<value.length(); i++){
//            if(value.charAt(i) >= '0' && value.charAt(i) <= '9'){
//                isNumber = true;
//            } else {
//                isNumber = false;
//            }

            if(value.charAt(i) >= 'A' && value.charAt(i) <= 'Z'){
                arrA[A] = value.charAt(i);
                A++;
            } else if(value.charAt(i) >= 'a' && value.charAt(i) <= 'z'){
                arra[a] = value.charAt(i);
                a++;
            } else if(value.charAt(i) >= '0' && value.charAt(i) <= '9'){
                arrNumber[number] = value.charAt(i);
                number++;
            }
        }
//        if(isNumber){
//            System.out.println(value+"는 숫자입니다.");
//        } else {
//            System.out.println(value+"는 숫자가 아닙니다.");
//        }

        System.out.print("숫자: " + number + '\n'+"대문자: " + A + '\n' + "소문자: " + a + '\n');
        for(int i=0; i<arrNumber.length; i++){
            System.out.print(arrNumber[i] + " ");
        }
        System.out.println();
        for(int i=0; i<arrA.length; i++){
            System.out.print(arrA[i] + " ");
        }
        System.out.println();
        for(int i=0; i<arra.length; i++){
            System.out.print(arra[i] + " ");
        }
        System.out.println();
    }
}

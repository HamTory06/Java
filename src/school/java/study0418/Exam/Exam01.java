package school.java.study0418.Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;

public class Exam01 {

    static int number02(String num){
        int j = 0;
        int num10 = 0;
        for(int i=num.length()-1; i>=0; i--){
            if(num.charAt(i) == '1'){
                num10+=Math.pow(2,j);
                j++;
            } else {
                j++;
            }
        }
        return num10;
    }
    public static void main(String[] args) throws IOException {
        System.out.print("2진수 입력: ");
        int num10 = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        String num = bf.readLine();
        if(num.length() > 10){
            System.out.println("2진수는 최대 10자리까지 입력가능합니다.");
            System.out.print("2진수 입력: ");
            num = bf.readLine();
        }
        int j = 0;
        for(int i=num.length()-1; i>=0; i--){
            if(num.charAt(i) == '1'){
                num10+=Math.pow(2,j);
                j++;
            } else {
                j++;
            }
        }
        System.out.println("입력한 2진수 " + "[ " + num+ " ]");
//        System.out.println("변경한 10진수 " + "[ " + number02()+ " ]");
    }





}

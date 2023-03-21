package school.study0321;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) {
        a();
//        int num01 = 10;
//        int num02 = 20;
//        int num03 = 30;
//        if(num01 > 0 & num02++ > 0){
//
//        } else if(num03++ < 10){
//
//        }
//        System.out.println("num02 : "+num02);
//        System.out.println("num03 : "+num03);
    }
    public static void a(){
        String str01 = "";
        try{
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(System.in));
            str01 = in.readLine();
            int num = 0;
            int str02 = 0;
            int str03 = 0;
            for(int i=0; i<str01.length(); i++){
                if(str01.charAt(i) >= 48 && str01.charAt(i) <= 57)
                    num++;
                else if(str01.charAt(i) >= 65 && str01.charAt(i) <= 89)
                    str02++;
                else if(str01.charAt(i) >= 97 && str01.charAt(i) <= 122)
                    str03++;
            }
            System.out.println("대문자: "+str02+ "\n"+ "소문자: "+str03 + "\n" +"숫자: " + num);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

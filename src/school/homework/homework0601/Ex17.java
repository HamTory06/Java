package school.homework.homework0601;

import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.println("정수 3개 입력>>");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a<b && b<c || c<b && b<a){
            System.out.println(b);
        } else if(b<a && a<c || c<a && a<b) {
            System.out.println(a);
        } else {
            System.out.println(c);
        }

        s.close();
    }
}
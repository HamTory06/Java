package school.homework.homework0601;

import java.util.Scanner;

public class Ex16 {
    private static int[] unit = new int[7];
    private static int[] number = new int[7];
    public static void main(String[] args) {
        unit = new int[]{50000,10000,1000,100,50,10,1};
        number = new int[]{0,0,0,0,0,0,0};
        Scanner s = new Scanner(System.in);
        int money = s.nextInt();
        int i=0;
        while (i < 7){
            money-=unit[i];
            number[i]++;
            if(money < unit[i]){
                i++;
            }
        }
        for(int j=0; j<7; j++){
            System.out.println(unit[j]+" "+number[j]);
        }
        s.close();
    }
}

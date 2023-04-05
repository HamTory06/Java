package school.java.study0405;

public class Main {
    public static void main(String[] args) {
//        for(int i=0; i<=10; i++){
//            for(int j=0; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int i=0;
//        while (i<=10){
//            int j=0;
//            while (j<=i){
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        int sum = 0;
        for(int i=1; i<=6; i++){
            for(int j=1; j<=6; j++){
                if(j+i == 6){
                    System.out.println(j + " " + i);
                    sum++;
                }
            }
        }
        System.out.println(sum);


    }
}

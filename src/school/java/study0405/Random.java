package school.java.study0405;

public class Random {
    public static void main(String[] args) {
//        for(int x=0; x<=10; x++){
//            for(int y=0; y<=10; y++){
//                if((x*2)+(y*4) == 10){
//                    System.out.println("x="+x+", "+"y="+y+", ");
//                }
//            }
//        }
//        for(int x=0;  ; x++){
//            for(int y=0;  ; y++){
//                if((x*2)+(y*4) == 10){
//                    System.out.println("x="+x+", "+"y="+y+", ");
//                    break;
//                }
//            }
//        }
        String str = "1234567890";
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            sum += str.charAt(i) -'0';
        }
        System.out.println("sum="+sum);
    }
}

package school.java.study0412;

public class Ex5_4 {
    public static void main(String[] args) {
        int[][] arr = {
                {5,5,5,5,5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };
        int total = 0;
        float avg;
        for(int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
        }
        avg = (float) total / (arr.length*arr[0].length);
        System.out.println("total = " + total);
        System.out.println("avg = " + avg);
    }
}

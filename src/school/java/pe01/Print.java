package school.java.pe01;

import java.util.Arrays;
import java.util.Random;

public class Print {

    private static final int MAX_DATA_SIZE = 10000;

    private int[] sampleData;

    private long time;

    public void makeSampleData(){
        this.sampleData = new int[MAX_DATA_SIZE];
        Random random = new Random();
        for(int i=0; i<this.sampleData.length; i++){
            this.sampleData[i] = random.nextInt(10000);
        }
    }

    public int[] time(int[] time){
        Sort sort = new Sort();
        long start = System.currentTimeMillis();
        time = sort.Sort(time);
        long end = System.currentTimeMillis();
        this.time = end - start;

        return time;
    }

    public void printTime(){
        System.out.printf("%d개의 자료를 정렬하는데 %d(ms)의 시간이 경과했습니다.\n", this.sampleData.length, this.time);
    }

    public static void main(String[] args) {
        Print print = new Print();
        print.makeSampleData();
        System.out.println("정렬전 : " + Arrays.toString(print.sampleData));
        System.out.println("정렬후 : " + Arrays.toString(print.time(print.sampleData)));
        print.printTime();
    }
}

package school.java.pe01;

public class Sort {

    public int[] Sort(int[] arrayNumber){
        for(int i=0; i<arrayNumber.length; i++){
            for(int j=0; j<arrayNumber.length; j++){
                if(arrayNumber[i] < arrayNumber[j]){
                    int temp;
                    temp = arrayNumber[i];
                    arrayNumber[i] = arrayNumber[j];
                    arrayNumber[j] = temp;
                }
            }
        }
        return arrayNumber;
    }
}

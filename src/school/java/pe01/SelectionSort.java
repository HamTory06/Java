package school.java.pe01;

public class SelectionSort {
    public int[] sort(int[] unsorted) {
        return this.doSelectionSorting(unsorted);
    }

    private int[] doSelectionSorting(int[] unsorted) {
        for(int i=0; i<unsorted.length; i++){
            for(int j=0; j<unsorted.length; j++){
                if(unsorted[i] < unsorted[j]){
                    int temp;
                    temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }
        return unsorted;
    }


}
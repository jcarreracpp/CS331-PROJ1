
/**
 *
 * @author Jorge
 */
public class runtest {
    public static void main(String[] args){
        int size = 65536;
        ArrayGen toot = new ArrayGen();
        int[] arrayone = toot.gen(size, false);
        int[] arraytwo = new int[size];
        
        printArray(arrayone, size);
        
        System.out.println();
        
        InsertionSort insertionsort = new InsertionSort();
        MergeSort mergesort = new MergeSort();
        QuickSort quicksort = new QuickSort();
        
        long startTime = System.nanoTime();
        
        //quicksort.sort1(arrayone, 0, (size-1));
        //quicksort.sort2(arrayone, 0, (size-1));
        //mergesort.sort(arrayone, arraytwo, 0, size);
        //insertionsort.sort(arrayone, size);
        
        long endTime = System.nanoTime();
        long duration = (endTime - startTime); 

        
        printArray(arrayone, size);
        System.out.println("That took " + (float)(duration / 1000000) + " milliseconds to run.");
    }
    
    public static void printArray(int[] array, int size){
        if (size > 10000) {
            for (int i = 0; i < size; i++) {
                if ((i + 1) % 1000 == 0) {
                    System.out.print(array[i] + " ");
                }
                if ((i + 1) % 10000 == 0) {
                    System.out.println();
                }
            }
        }else if(size > 1000){
            for (int i = 0; i < size; i++) {
                if ((i + 1) % 100 == 0) {
                    System.out.print(array[i] + " ");
                }
                if ((i + 1) % 1000 == 0) {
                    System.out.println();
                }
            }
        }else if(size > 100){
            for (int i = 0; i < size; i++) {
                if ((i + 1) % 10 == 0) {
                    System.out.print(array[i] + " ");
                }
                if ((i + 1) % 100 == 0) {
                    System.out.println();
                }
            }
        }else{
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
                if ((i + 1) % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
}

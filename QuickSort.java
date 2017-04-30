/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class QuickSort {
    QuickSort(){}
    
    public void sort1(int[] array, int p, int q){
        if(p < q){
            int pivotposition = partition(array, p, q);
            sort1(array, p, pivotposition - 1);
            sort1(array, pivotposition + 1, q);
        }
    }
    
    public void sort2(int[] array, int p, int q){
        InsertionSort insertionsort = new InsertionSort();
        
        if ((q - p) <= 16) {
            insertionsort.sort(array, (q - p));
        } else {
            if (p < q) {
                int pivotposition = partition(array, p, q);
                sort1(array, p, pivotposition - 1);
                sort1(array, pivotposition + 1, q);
            }
        }
    }
    
    public int partition(int[] array, int first, int last){
//        int pivot = array[last];
//        int tb = first - 1;
//        int temp = 0;
//
//        for(int k = first; k < last; k++){
//            if(array[k] <= pivot){
//                tb++;
//                temp = array[tb];
//                array[tb] = array[k];
//                array[k] = temp;
//            }
//        }
//        
//        temp = array[(tb+1)];
//        array[(tb+1)] = array[last];
//        array[last] = temp;
//        return (tb + 1);
        int pivot = array[first];
        int tb = first + 1;
        int ts = last;
        int temp;
        
        while(true){
            while(tb <= last && array[tb] <= pivot){
                tb++;
            }
            while(ts > first && array[ts] >= pivot){
                ts--;
            }
            if(tb < ts){
                temp = array[tb];
                array[tb] = array[ts];
                array[ts] = temp;
            }else{
            break;
            }
        }
        
        array[first] = array[ts];
        array[ts] = pivot;
        return ts;

    }
}

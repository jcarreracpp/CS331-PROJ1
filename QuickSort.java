
import java.util.Random;

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
    
        public void sort3(int[] array, Random rand, int p, int q){
        int temp;
        int rtemp;
            
        if((q-p+1) >= 16){
            rtemp = (p + rand.nextInt(q-p+1));
            temp = array[p];
            array[p] = array[rtemp];
            array[rtemp] = temp;  
        }    
            
        if(p < q){
            int pivotposition = partition(array, p, q);
            sort1(array, p, pivotposition - 1);
            sort1(array, pivotposition + 1, q);
        }
    }
    
    public int partition(int[] array, int first, int last){
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

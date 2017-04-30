/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class InsertionSort {

    InsertionSort(){}
    
    public void sort(int[] array, int max){
        int x;
        int j;
        
        if(max > 1){
            sort(array, (max-1));
            x = array[max-1];
            j = max - 2;
            
            while(j >= 0 && array[j] > x){
                array[j+1] = array[j];
                j--;
            }
            
            array[j + 1] = x;
        }
    }
    
}

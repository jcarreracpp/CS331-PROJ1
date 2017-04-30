/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class MergeSort {
    
    MergeSort(){}
    
    public void sort(int[] array,int[] result, int low, int high){
        
        int mid = (low + high)/2;
        
        if(low + 1 < high){
            sort(array, result, low, mid);
            sort(array, result, mid, high);
            
            merge(array, result, low, mid, high);
        }else{
            result[low] = array[low];
        }
    }
    public void merge(int[] array, int[] result, int low, int mid, int high){
        int i = low;
        int j = mid;
        int k = low;
        
        while(i < mid && j < high){
            if(array[i] < array[j]){
                result[k] = array[i];
                k++;
                i++;
            }else{
                result[k] = array[j];
                k++;
                j++;
            }
        }
        while(i < mid){
            result[k] = array[i];
            k++;
            i++;
        }
        while(j < high){
            result[k] = array[j];
            k++;
            j++;
        }
        
        for (int m = low; m < high; m++){
            array[m] = result[m];
        }       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class ArrayGen {


    ArrayGen(){}
    
    public int[] gen(int size, boolean sorted){
        int[] result = new int[size];
        int sortedCount = 0;
        
        if(sorted){
            for(int i = 0; i < size; i++){
                result[i] = sortedCount;
                sortedCount++;
            }
        }else{
            for(int j = 0; j < size; j++){
                result[j] = (int)(Math.random() * 255);
            }
        }
        return result;
    }
    
}

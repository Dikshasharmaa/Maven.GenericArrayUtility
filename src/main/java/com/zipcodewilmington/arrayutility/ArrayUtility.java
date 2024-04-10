package com.zipcodewilmington.arrayutility;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T>{
    public T[] inputArray;
    public ArrayUtility(T[] inputArray){
        this.inputArray = inputArray;
    }

    public T[] removeValue(T valueToRemove) {
        T[] array = (T[]) new Object[inputArray.length];
        for(int i =0; i< inputArray.length; i++){
            if(inputArray[i] != valueToRemove){
                array[i] = inputArray[i];
            }
        }


        return array;
    }

    public T getNumberOfOccurrences(T valueToEvaluate) {
        T count = null;
        int sum =0;
        for(int i =0 ; i< inputArray.length;i++){
            if(inputArray[i] == valueToEvaluate){
                count = sum+1;
            }
        }

        return count;
    }

    public T countDuplicatesInMerge(Integer[] arrayToMerge, T valueToEvaluate) {
        return null;
    }
}

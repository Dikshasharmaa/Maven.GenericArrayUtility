package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T>{
    private T[] inputArray;
    public ArrayUtility(T[] inputArray){
        this.inputArray = inputArray;
    }

    public T[] removeValue(T valueToRemove) {
        List<T> array = new ArrayList<>();
        for(T t : inputArray){
            if(!t.equals(valueToRemove)){
                array.add(t);
            }
        }

        return array.toArray(Arrays.copyOf(inputArray,array.size()));
    }

    public int getNumberOfOccurrences(T valueToEvaluate) {
        int count = 0;
        int sum =0;
        for(int i =0 ; i< inputArray.length;i++){
            if(inputArray[i].equals(valueToEvaluate)){
                count++;
            }
        }

        return count;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        //T mergedArray[] = (T[]) new Object[inputArray.length + arrayToMerge.length];
        int count =0;
        for(int i = 0; i<inputArray.length;i++){
            if(inputArray[i].equals(valueToEvaluate)){
                count++;
            }
        }
        for(int j =0;j<arrayToMerge.length;j++){
            if(arrayToMerge[j].equals(valueToEvaluate)){
                count++;
            }

        }
        return count;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        int maxCount =0;
        T value = null;
        for(int i =0; i<inputArray.length;i++){
            int count =0;
            for(int j =0;j<= inputArray.length;j++){
                if(inputArray[i] == inputArray[j]){
                    count++;
                }
            }
            if(count>maxCount){
                value = inputArray[i];
            }
        }

        return value;
    }
}

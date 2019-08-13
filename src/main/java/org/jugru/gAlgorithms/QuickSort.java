package org.jugru.gAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

import static org.jugru.gAlgorithms.util.ArrayUtils.concatenate;

public class QuickSort {

    public static int[] sort(int[] array) {
        if(array.length < 2) {
            return array;
        }

        int left = 0;
        int right = array.length - 1;

        int middle = (left + right) / 2;



        int[] leftArr = Arrays.stream(array).filter(el -> el < array[middle]).toArray();
        int[] rightArr = Arrays.stream(array).filter(el -> el > array[middle]).toArray();
        int[] sameAsMiddle = Arrays.stream(array).filter(el -> el == array[middle]).toArray();

        int[] leftArrSorted = sort(leftArr);
        int[] rightArrSorted = sort(rightArr);


        return concatenate(leftArrSorted, sameAsMiddle , rightArrSorted);
    }






}

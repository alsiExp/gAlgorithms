package org.jugru.gAlgorithms.util;

import java.util.Random;

public class ArrayUtils {

    private static Random generator = new Random();


    public static int[] initArray(int arrLength, int bound) {
        int[] randomArray = new int[arrLength];
        for (int i=0; i<arrLength; i++) {
            randomArray[i] = generator.nextInt(bound);
        }
        return randomArray;
    }

    public static int[] concatenate(int[] a, int[] b, int[] c) {
        return concatenate(concatenate(a, b), c);
    }

    public static int[] concatenate(int[] a, int[] b) {
        int len = a.length + b.length;

        int[] res = new int[len];
        int pos = 0;
        for (int value : a) {
            res[pos] = value;
            pos++;
        }
        for (int value : b) {
            res[pos] = value;
            pos++;
        }
        return res;
    }

}

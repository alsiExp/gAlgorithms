package org.jugru.gAlgorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.jugru.gAlgorithms.util.ArrayUtils.concatenate;
import static org.jugru.gAlgorithms.util.ArrayUtils.initArray;
import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTest {

    @Test
    public void testSort() {

        int[] randomArray = initArray(1000, 1000);

        System.out.println(Arrays.toString(randomArray));

        int[] sorted = QuickSort.sort(randomArray);

        System.out.println(Arrays.toString(sorted));

        assertEquals(randomArray.length, sorted.length);

        assertArrayEquals(sorted, createSortedCopy(randomArray));

    }

    @Test
    public void testSortWithSameNumbers() {

        int[] randomArray1 = initArray(10, 1000);
        int[] randomArray = concatenate(randomArray1, randomArray1, randomArray1);

        System.out.println(Arrays.toString(randomArray));

        int[] sorted = QuickSort.sort(randomArray);

        System.out.println(Arrays.toString(sorted));

        assertEquals(randomArray.length, sorted.length);
        assertArrayEquals(sorted, createSortedCopy(randomArray));
    }

    private int[] createSortedCopy(int[] arr) {
        int[] copy = Arrays.copyOfRange(arr, 0, arr.length);
        Arrays.sort(copy);
        return copy;
    }

}

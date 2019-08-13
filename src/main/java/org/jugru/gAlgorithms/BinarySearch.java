package org.jugru.gAlgorithms;


public class BinarySearch {

    public static Integer search(int[] array, long value) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if(array[mid] == value) {
                return mid;
            }
            if(value > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            System.out.println("for " + value + "=>" + low + "/" + high + "/" + mid );
        }

        return null;
    }

}

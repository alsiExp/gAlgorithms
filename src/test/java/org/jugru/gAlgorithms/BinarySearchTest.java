package org.jugru.gAlgorithms;


import org.junit.jupiter.api.Test;

import static org.jugru.gAlgorithms.BinarySearch.search;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    public static int[] testArray = {1,3,4,5,6,7,8,9,11,15,17,22,25,27};

    @Test
    void searchTest() {

        Integer found = search(testArray, 4);

        assertNotNull(found);

        assertEquals(2, unBox(found));
        assertEquals(0, unBox(search(testArray, 1)));
        assertEquals(13, unBox(search(testArray, 27)));
        assertEquals(3, unBox(search(testArray, 5)));
        assertEquals(4, unBox(search(testArray, 6)));
        assertEquals(8, unBox(search(testArray, 11)));

        assertNull(search(testArray, -1));
        assertNull(search(testArray, 89));
    }

    private int unBox(Integer val) {
        if(val == null) {
            return -1;
        }
        return val;
    }
}
package com.epam.rd.autotasks;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;

public class SortingTest {

    Sorting sorting = new Sorting();


    @Test(expected = RuntimeException.class)
    public void testNullCase() {
        sorting.sort(null);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testEmptyCase() {
        int[] arr = {};
        sorting.sort(arr);
        int i = arr[0];
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testSingleElementArrayCase() {
        int[] arr = {10};
        sorting.sort(arr);
        int i = arr[1];
    }

    @Test()
    public void testSortedArraysCase() {
        int[] arr = {8, 5, 3, 6, 2, 1, 9};
        sorting.sort(arr);
        int[] arrSort = {1, 2, 3, 5, 6, 8, 9};
        assertArrayEquals(arrSort, arr);
    }

    @Test
    public void testOtherCases() {
        int[] a = {5, 7, 4, 2, 7};
        sorting.sort(a);
        boolean negative = a.length <= 0;
        assertFalse(negative);
    }
}
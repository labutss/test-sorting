package com.epam.rd.autotasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {

    Sorting sorting = new Sorting();


    @Test(expected = IllegalArgumentException.class)
    public void testNullCase() {
        sorting.sort(null);
    }

    @Test
    public void testEmptyCase() {
        int[] arr = new int[0];
        sorting.sort(arr);
        int length = arr.length;
        assertEquals(0, length);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] arr = {10};
        sorting.sort(arr);
        assertEquals(10, arr[0]);
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
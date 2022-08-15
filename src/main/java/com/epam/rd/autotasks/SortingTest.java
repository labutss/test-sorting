package com.epam.rd.autotasks;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;

public class SortingTest {

    Sorting sorting = new Sorting();


    @Test(expected = IllegalArgumentException.class)
    public void testNullCase() {
        sorting.sort(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyCase() {
        int[] arr = {};
        sorting.sort(arr);
           }

    @Test(expected = IllegalArgumentException.class)
    public void testSingleElementArrayCase() {
        int[] arr = {10};
        sorting.sort(arr);


    }

    @Test()
    public void testSortedArraysCase() {
        int[] arr = {8, 5, 3, 6, 2, 1, 9};
        sorting.sort(arr);
        int[] arrSort = {1, 2, 3, 5, 6, 8, 9};
        assertArrayEquals(arrSort, arr);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void testOtherCases() {
        int[] a = new int[-1];
        sorting.sort(a);
    }
}
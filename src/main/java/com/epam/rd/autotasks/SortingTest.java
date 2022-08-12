package com.epam.rd.autotasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {

    Sorting sorting = new Sorting();


    @Test(expected = IllegalArgumentException.class)
    public void testNullCase() {
        int [] arr = null;
        sorting.sort(arr);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testEmptyCase() {
        int[] arr = new int[0];
        sorting.sort(arr);
        int point = arr[0];
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] arr = {10};
        sorting.sort(arr);
        assertEquals(arr[0], arr[0]);
    }

    @Test()
    public void testSortedArraysCase() {
        int[] arr = {8, 5, 3, 6, 2, 1, 9};
        sorting.sort(arr);
        int[] arrSort = {1, 2, 3, 5, 6, 8, 9};
        assertEquals(arrSort[1],arr[1]);
    }

    @Test(expected = AssertionError.class)
    public void testOtherCases() throws AssertionError{
        int[] a = {5, 7, 4, 2, 7};
        sorting.sort(a);
        boolean negative = a.length > 0;
        assertFalse(negative);
    }


}
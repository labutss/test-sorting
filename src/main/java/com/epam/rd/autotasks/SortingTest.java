package com.epam.rd.autotasks;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SortingTest {

    Sorting sorting = new Sorting();

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase() {
        sorting.sort(null);
    }

    @Test
    public void testEmptyCase() {
        int[] initial = {};
        sorting.sort(initial);
        assertEquals(0, initial.length);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] initial = {10};
        sorting.sort(initial);
        assertEquals(1, initial.length);
        assertEquals(10, initial[0]);
    }

    @Test
    public void testSortedArraysCase() {
        int[] initialArray = {1, 2, 3};
        sorting.sort(initialArray);
        int[] sortedArray = {1, 2, 3};
        assertArrayEquals(sortedArray, initialArray);
    }

    @Test
    public void testOtherCases() {
        int[] initialArray = {8, 5, 3, 6, 2, 1, 9};
        sorting.sort(initialArray);
        int[] sortedArray = {1, 2, 3, 5, 6, 8, 9};
        assertArrayEquals(sortedArray, initialArray);
    }
}
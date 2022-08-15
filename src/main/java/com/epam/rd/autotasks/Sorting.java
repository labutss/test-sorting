package com.epam.rd.autotasks;

import java.util.Arrays;

public class Sorting {
    public void sort(int[] array) {
        if (array == null || array.length<=1) {
            throw new IllegalArgumentException();
        }  else {
            Arrays.sort(array);
        }
    }

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int [] ar = {};
        sorting.sort(ar);
    }
}

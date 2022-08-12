package com.epam.rd.autotasks;

import java.util.Arrays;

public class Sorting {
    public void sort(int[] array) {
        if (array == null ) {
            throw new IllegalArgumentException();
        }  else {
            Arrays.sort(array);
        }
    }

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int []  arr = new int[0];
        sorting.sort(arr);
        System.out.println(arr[0]);
    }
}

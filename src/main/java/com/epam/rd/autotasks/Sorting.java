package com.epam.rd.autotasks;

import java.util.Arrays;

public class Sorting {
    public void sort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException();
        } else if (array.length <= 1) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            Arrays.sort(array);
        }
    }
}

package com.clase4;

import java.util.Comparator;

public class BubbleSortImple<T extends Comparator<? super T>> implements Sorter {

    @Override
    public void sort(Object arr, Comparator c) {

    }

    static <T> void bubbleSort(T arr[], Comparator<T> c) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (c.compare(arr[j],arr[j+1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

}

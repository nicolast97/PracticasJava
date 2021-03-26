package com.clase4;

import java.util.Comparator;

public class QuickSorterImple<T extends Comparator<? super T>> implements Sorter{

    private T arr ;
    private  Comparator c;
    int start;
    int end;

    public QuickSorterImple( T arr, Comparator c, int startIndex, int endIndex) {
        this.arr = arr;
        this.c = c;
        this.start = startIndex;
        this.end = endIndex;
    }

    @Override
    public void sort(Object []arr, Comparator c) {

    }

    private void quicksort(T[] array, int startIndex, int endIndex, Comparator c)
    {
        if (startIndex < endIndex)
        {
            int pivotIndex = partition(array, startIndex, endIndex, c);
            quicksort(array, startIndex, pivotIndex, c);
            quicksort(array, pivotIndex + 1, endIndex, c);
        }
    }

    private int partition(T[] array, int startIndex, int endIndex, Comparator c)
    {
        int pivotIndex = (startIndex + endIndex) / 2;
        T pivotValue = array[pivotIndex];
        startIndex--;
        endIndex++;
        while (true)
        {
            do startIndex++; while (c.compare(array[startIndex],pivotValue) < 0) ;
            do endIndex--; while (c.compare(array[startIndex],pivotValue) > 0) ;
            if (startIndex >= endIndex) return endIndex;
            T temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
        }
    }
}

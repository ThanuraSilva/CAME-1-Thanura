package com.thanu.came.challange2;

import java.util.Arrays;

public class ArraySort {
    public void sortArray(int[] array) {
        int[] arr = (array == null) ? new int[0] : Arrays.copyOf(array, array.length);
        if (arr.length <= 1) {
            System.out.println(toReadable(arr));
            return;
        }
        int[] aux = new int[arr.length];
        sort(arr, aux, 0, arr.length - 1);
        System.out.println(toReadable(arr));
    }
    private void sort(int[] a, int[] sup, int lower, int upper) {
        if (lower >= upper) return;
        int mid = lower + (upper - lower) / 2;
        sort(a, sup, lower, mid);
        sort(a, sup, mid + 1, upper);

        if (a[mid] <= a[mid + 1]) return;

        merge(a, sup, lower, mid, upper);
    }

    private void merge(int[] a, int[] aux, int lo, int mid, int hi) {

        for (int k = lo; k <= hi; k++) aux[k] = a[k];

        int i = lo, j = mid + 1, k = lo;
        while (i <= mid && j <= hi) {
            if (aux[i] <= aux[j]) a[k++] = aux[i++];
            else                  a[k++] = aux[j++];
        }
        while (i <= mid) a[k++] = aux[i++];
    }

    private static String toReadable(int[] a) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < a.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(a[i]);
        }
        sb.append("]");
        return sb.toString();
    }

}

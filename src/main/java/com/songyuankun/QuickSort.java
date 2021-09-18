package com.songyuankun;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] ints = {2, 3, 1, 5, 12, 13, 8, 5, 6, 5, 2, 2, 7};
        quickSort(ints, 0, ints.length - 1);
        System.out.println(Arrays.toString(ints));
    }

    private static void quickSort(int[] ints, int left, int right) {
        if (left >= right) {
            return;
        }
        int p = getP(ints, left, right);
        quickSort(ints, left, p - 1);
        quickSort(ints, p + 1, right);

    }

    private static int getP(int[] array, int left, int right) {

        // base中存放基准数
        int base = array[left];
        int i = left, j = right;
        while (i != j) {
            while (array[j] >= base && i < j) {
                j--;
            }
            while (array[i] <= base && i < j) {
                i++;
            }
            if (i < j) {
                swap(array, i, j);
            }
        }
        array[left] = array[i];
        array[i] = base;
        return i;
    }


    public static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }


}

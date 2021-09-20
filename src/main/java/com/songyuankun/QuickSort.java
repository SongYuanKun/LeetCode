package com.songyuankun;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] ints = {9, 3, 1, 6, 2, 1};
        //46339
        new QuickSort().sort(ints, 0, ints.length - 1);
        System.out.println(Arrays.toString(ints));
    }

    private void sort(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        // base中存放基准数
        int base = array[left];
        int i = left, j = right;
        while (i < j) {
            // 顺序很重要，先从右边开始往左找，直到找到比base值小的数
            while (array[j] >= base && i < j) {
                j--;
            }

            // 再从左往右边找，直到找到比base值大的数
            while (array[i] <= base && i < j) {
                i++;
            }

            // 上面的循环结束表示找到了位置或者(i>=j)了，交换两个数在数组中的位置
            if (i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }

        // 将基准数放到中间的位置（基准数归位）
        array[left] = array[i];
        array[i] = base;

        // 递归，继续向基准的左右两边执行和上面同样的操作
        // i的索引处为上面已确定好的基准值的位置，无需再处理
        sort(array, left, i - 1);
        sort(array, i + 1, right);
    }

    private int getP(int[] ints, int start, int end) {
        int p = ints[start];
        int low = start;
        int height = end;
        if (low >= height) {
            return height;
        }
        while (low != height) {
            while (p <= ints[height] && low < height) {
                height--;
            }
            while (p > ints[low] && low < height) {
                low++;
            }
            if (low < height) {
                swap(ints, low, height);
            }
        }
        return low;
    }

    private void swap(int[] ints, int low, int height) {
        int tmp = ints[low];
        ints[low] = ints[height];
        ints[height] = tmp;
    }


}
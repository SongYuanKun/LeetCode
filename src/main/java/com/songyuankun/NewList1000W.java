package com.songyuankun;

import java.util.Arrays;
import java.util.Random;

public class NewList1000W {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Random random = new Random();
        int value = 1000_0000;//使用数组速度更快
        int[] list = new int[value];
        for (int j = 0; j < value; ++j) {
            list[j] = j + 1;
        }
        int index = 0;
        int count = 0;
        int tmp = 0;
        while (value > 0) {
            index = random.nextInt(value);
            //System.out.println(list[count + index]);
            tmp = list[count + index];
            list[count + index] = list[count];
            list[count] = tmp;
            ++count;
            --value;
        }
        long end = System.currentTimeMillis();
        // ----验证是否正确
        Arrays.sort(list);
        int i = 0, size = list.length;
        for (; i < size; ++i) {
            //System.out.println(list[i]);
            if (list[i] != (i + 1)) {
                System.out.println(i + "error" + list[i]);
            }
        }
        // ----验证是否正确System.out.println("creat4------");
        System.out.println("执行耗时 : " + (end - start) / 1000f + " 秒 ");
        System.out.println("完了，集合大小为" + list.length);
    }

}
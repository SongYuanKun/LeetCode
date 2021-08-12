package com.songyuankun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NewList1000W_1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Random random = new Random();
        int value = 1000;//使用数组速度更快
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < value; j++) {
            int i = random.nextInt(value);
            System.out.println(i);
            list.add(i);
        }
        long end = System.currentTimeMillis();
        // ----验证是否正确
        int i = 0;
        int size = list.size();
        Collections.sort(list);
        for (; i < size; ++i) {
            //System.out.println(list[i]);
            if (list.get(i) != (i + 1)) {
                System.out.println(i + "error" + list.get(i));
            }
        }
        // ----验证是否正确System.out.println("creat4------");
        System.out.println("执行耗时 : " + (end - start) / 1000f + " 秒 ");
        System.out.println("完了，集合大小为" + list.size());
    }

}
package com.songyuankun;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> integerIntegerHashMap = new ConcurrentHashMap<>(2);
        for (int i = 0; i < 3000; i++) {
            integerIntegerHashMap.put(String.valueOf(i), i);
        }

    }

}

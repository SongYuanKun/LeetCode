package com.songyuankun;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String, Integer> integerIntegerHashMap = new HashMap<>(2);

        for (int i = 0; i < 3000; i++) {
            integerIntegerHashMap.put(String.valueOf(i), i);
        }

    }

}

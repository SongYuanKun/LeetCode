package com.songyuankun;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>(2);

        for (int i = 0; i < 3000; i++) {
            hashMap.put(String.valueOf(i), i);
        }

    }

}

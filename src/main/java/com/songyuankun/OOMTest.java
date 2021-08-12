package com.songyuankun;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OOMTest {
    public static void main(String... args) {
        List<String> list = new ArrayList<String>();
        while (true) {
            list.add(UUID.randomUUID().toString().intern());
        }
    }
}
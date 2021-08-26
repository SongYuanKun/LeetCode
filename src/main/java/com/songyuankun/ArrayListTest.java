package com.songyuankun;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 3000; i++) {
            arrayList.add(i);
        }

    }

}

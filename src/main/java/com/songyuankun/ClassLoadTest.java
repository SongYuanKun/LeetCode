package com.songyuankun;

public class ClassLoadTest {
    public static void main(String[] args) throws ClassNotFoundException {
        QuickSort s = new QuickSort();
        ClassLoader classLoader = s.getClass().getClassLoader();
        System.out.println(classLoader.toString());
        MyClassLoader myClassLoader=new MyClassLoader("com/songyuankun");
        Class<?> string = myClassLoader.loadClass("com.songyuankun.QuickSort");
        ClassLoader classLoader1 = string.getClassLoader();
        System.out.println(classLoader1.toString());


    }
}

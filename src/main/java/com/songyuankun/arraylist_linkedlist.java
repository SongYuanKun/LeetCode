package com.songyuankun;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class arraylist_linkedlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            ArrayList alist=new ArrayList(100001);
            LinkedList llist=new LinkedList();
            long startTime = System.currentTimeMillis();    //获取开始时间

            for(int i=0;i<num;i++){
                alist.add(new Integer(i));
            }   //测试的代码段

            long endTime = System.currentTimeMillis();    //获取结束时间

            System.out.println("ArrayList程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间

            long startTime1 = System.currentTimeMillis();    //获取开始时间

            for(int i=0;i<num;i++){
                llist.add(new Integer(i));
            }   //测试的代码段

            long endTime1 = System.currentTimeMillis();    //获取结束时间

            System.out.println("LinkedList程序运行时间：" + (endTime1 - startTime1) + "ms");    //输出程序运行时间
        }
    }
}
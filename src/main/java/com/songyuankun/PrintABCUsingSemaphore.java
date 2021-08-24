package com.songyuankun;

import java.util.concurrent.Semaphore;

public class PrintABCUsingSemaphore {
    private static Semaphore semaphoreA = new Semaphore(1);
    private static Semaphore semaphoreB = new Semaphore(0);
    private static Semaphore semaphoreC = new Semaphore(0);
    private int times;

    public PrintABCUsingSemaphore(int times) {
        this.times = times;
    }

    public static void main(String[] args) throws InterruptedException {
        PrintABCUsingSemaphore printer = new PrintABCUsingSemaphore(10);
        new Thread(() -> printer.print("A", semaphoreA, semaphoreB), "A").start();
        new Thread(() -> printer.print("B", semaphoreB, semaphoreC), "B").start();
        new Thread(() -> printer.print("C", semaphoreC, semaphoreA), "C").start();
    }

    private void print(String name, Semaphore current, Semaphore next) {
        for (int i = 0; i < times; i++) {
            try {
                current.acquire();
                System.out.print(name);
                next.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
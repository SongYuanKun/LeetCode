package com.songyuankun;

/**
 * https://leetcode-cn.com/problems/jJ0w9p/
 */
public class JJ0w9p {
    public static void main(String[] args) {

        //46339
        int result = new JJ0w9p().mySqrt(2147395599);
        System.out.print(result);
    }

    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        return (int) mySqrt(x, x);
    }

    public long mySqrt(long x, int source) {
        long i = x >> 1 + 1;
        if (i * i > source) {
            return mySqrt(i, source);
        } else {
            return i;
        }
    }

}
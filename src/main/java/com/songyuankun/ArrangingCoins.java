package com.songyuankun;

/**
 * todo
 * https://leetcode-cn.com/problems/jJ0w9p/
 */
public class ArrangingCoins {
    public static void main(String[] args) {

        //46339
        int result = new ArrangingCoins().arrangeCoins(1804289383);
        System.out.println(result);
    }

    public int arrangeCoins(int n) {
        int left = 0;
        int right = n;
        while (left <= right) {
            long mid = ((right - left) / 2) + left;
            float result = (float) (mid * mid + mid) / 2;
            if (result == n) {
                return (int) mid;
            } else if (result < n) {
                left = (int)mid + 1;
            } else {
                right = (int)mid - 1;
            }
        }
        return right;
    }

}
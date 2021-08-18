package com.songyuankun;

/**
 * todo
 * https://leetcode-cn.com/problems/jJ0w9p/
 */
public class LemonadeChange {
    int five = 0;
    int ten = 0;
    int twenty = 0;

    public static void main(String[] args) {
        //46339
        boolean result = new LemonadeChange().lemonadeChange(new int[]{5, 5, 10, 10, 20});
        System.out.println(result);
    }

    public boolean lemonadeChange(int[] bills) {
        for (int pay : bills) {
            if (!zhaoqian(pay - 5)) {
                return false;
            }
            if (pay == 5) {
                five++;
            }
            if (pay == 10) {
                ten++;
            }
            if (pay == 20) {
                twenty++;
            }
        }
        return true;
    }

    private boolean zhaoqian(int pay) {
        if (five <= 0) {
            return false;
        }
        if (pay == 0) {
            return true;
        }
        if (twenty > 0 && pay >= 20) {
            twenty--;
            return zhaoqian(pay - 20);
        }
        if (ten > 0 && pay >= 10) {
            ten--;
            return zhaoqian(pay - 10);
        }
        if (pay >= 5) {
            five--;
            return zhaoqian(pay - 5);
        }
        return false;
    }


}